package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodType;
import com.example.demo.repository.BloodTypeRepository;

@Service
@Transactional(rollbackOn=Exception.class)
public class BloodTypeService{
    @Autowired
    BloodTypeRepository repository;
   
    public List<BloodType> findAll(){
       return repository.findAll();
    }
}