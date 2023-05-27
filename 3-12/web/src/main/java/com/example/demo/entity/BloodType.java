package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="blood_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BloodType{
   @Id
   @Column(name="id")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
 
   @Column(name="name")
   @NotEmpty(message = "血液型を入力してください")
   private String name;
}