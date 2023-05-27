package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BloodType;

@Repository
public interface BloodTypeRepository extends JpaRepository<BloodType,Integer>{}