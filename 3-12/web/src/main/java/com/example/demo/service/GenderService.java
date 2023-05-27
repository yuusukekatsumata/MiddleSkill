package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Gender;
import com.example.demo.repository.GenderRepository;

@Service
@Transactional(rollbackOn=Exception.class)
public class GenderService{
    @Autowired
    GenderRepository repository;
   
    public List<Gender> findAll(){
       return repository.findAll();
    }
   
}
