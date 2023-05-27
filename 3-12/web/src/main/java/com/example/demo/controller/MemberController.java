package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.BloodType;
import com.example.demo.entity.Gender;
import com.example.demo.entity.Member;
import com.example.demo.form.MemberForm;
import com.example.demo.form.MemberForm2;
import com.example.demo.service.BloodTypeService;
import com.example.demo.service.GenderService;
import com.example.demo.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private GenderService genderService;
    @Autowired
    private BloodTypeService bloodtypeService;
   
    @GetMapping
    public String index(Model model) {
        List<Member> members = memberService.findAll();
        model.addAttribute("members", members);
        return "index";
    }
   
    @GetMapping("new")
    public String newMember(Model model) {
    	Member member = new Member();
        model.addAttribute("member", member);
        
        List<Gender> gender = genderService.findAll();
        Map<Integer, String> gendermap = new HashMap<>();
        for(Gender genders : gender) {
        gendermap.put(genders.getId(),genders.getName() );
        }
        model.addAttribute("gender", gendermap);
        
        List<BloodType> bloodtype = bloodtypeService.findAll();
        Map<Integer, String> bloodtypemap = new HashMap<>();
        for(BloodType bloodtypes : bloodtype) {
        bloodtypemap.put(bloodtypes.getId(),bloodtypes.getName() );
        }
        model.addAttribute("bloodtype", bloodtypemap);
        
        return "new";
    } 
   
    @GetMapping("{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        Member member = memberService.findOne(id);
        model.addAttribute("member", member);
        return "edit";
    }
   
    @PostMapping
    public String create(@Valid @ModelAttribute MemberForm memberform, BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) return "new";
    	Member member = new Member();
    	BeanUtils.copyProperties(memberform, member);
    	MemberForm2 memberform2 = new MemberForm2();
    	memberform.setMemberform2(memberform2);
    	memberform.getMemberform2().setName(memberform.getName() + "様");
    	member.setName(memberform.getMemberform2().getName());
    	
		Logger middleskill = Logger.getLogger("middleskill log");
		middleskill.setLevel(Level.CONFIG);	
		String path =  System.getProperty("user.dir"); path = new File(path, "middleskill.log").getPath();
		System.out.println(path); 			
		
		try {
			FileHandler fh = new FileHandler("middleskill.log");
            middleskill.addHandler(fh);
            fh.setFormatter(new java.util.logging.SimpleFormatter());
            middleskill.addHandler(fh);
			middleskill.setLevel(Level.INFO);
			throw new NullPointerException();
		}catch(NullPointerException e){
			middleskill.log(Level.INFO,"ミドルスキルログが発生しました。", e);
		} catch (IOException e) {
				e.printStackTrace();
		}
		memberService.save(member);
		
		return "redirect:/member";
	}
    
    @PostMapping("{id}/edit")
    public String update(@PathVariable Integer id, @Validated @ModelAttribute Member member, BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) return "edit";
    	member.setId(id);
        memberService.save(member);
        return "redirect:/member";
    }
   
    @PostMapping("{id}")
    public String destroy(@PathVariable Integer id) {
        memberService.delete(id);
        return "redirect:/member";
    }
}
