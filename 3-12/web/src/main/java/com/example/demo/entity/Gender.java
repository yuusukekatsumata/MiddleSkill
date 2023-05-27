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
@Table(name="gender")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Gender{
   @Id
   @Column(name="id")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
 
   @Column(name="name")
   @NotEmpty(message = "性別を入力してください")
   private String name;
}
