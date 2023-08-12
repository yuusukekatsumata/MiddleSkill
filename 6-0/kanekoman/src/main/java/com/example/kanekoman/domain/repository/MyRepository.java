package com.example.kanekoman.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kanekoman.domain.entity.MyEntity;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface MyRepository extends JpaRepository<MyEntity, Integer> {
	
}