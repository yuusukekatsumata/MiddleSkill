package com.example.kanekoman.domain.service.Serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kanekoman.domain.dto.MyDto;
import com.example.kanekoman.domain.dto.MyDtoUpdate;
import com.example.kanekoman.domain.entity.MyEntity;
import com.example.kanekoman.domain.repository.MyRepository;
import com.example.kanekoman.domain.service.Service.MyService;

@Service
public class MyServiceimpl implements MyService {

	@Autowired
	MyRepository myRepository;
	
	@Override
	public List<MyEntity> searchAll(){
		return myRepository.findAll();
	}
	
	@Override
	public MyEntity findById(Integer id) {
		//実装1行
		return myRepository.getOne(id);
	}	 

	@Override
	public void create(MyDto myDto) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		MyEntity user = new MyEntity();
		user.setName(myDto.getName());
		user.setAddress(myDto.getAddress());
		user.setPhone(myDto.getPhone());
		user.setCreateDate(now);
		user.setUpdateDate(now);
		myRepository.save(user);
	}
	@Override
	public void update(MyDtoUpdate myDtoUpdate) {
		//実装6行		
		MyEntity user = findById(myDtoUpdate.getId());
		user.setAddress(myDtoUpdate.getAddress());
		user.setName(myDtoUpdate.getName());
		user.setPhone(myDtoUpdate.getPhone());
		user.setUpdateDate(new Date());
		myRepository.save(user);
	}
	
	@Override
	public void delete(Integer id){
		//実装2行
		MyEntity user = findById(id);
		myRepository.delete(user);
	}
}