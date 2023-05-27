package com.example.demo.form;

import lombok.Data;

@Data
public class MemberForm {
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Integer gender_id;
	
	private String date;
	
	private Integer blood_type_id;
	
	private MemberForm2 memberform2;
}
