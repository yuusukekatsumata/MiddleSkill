package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender,Integer>{}