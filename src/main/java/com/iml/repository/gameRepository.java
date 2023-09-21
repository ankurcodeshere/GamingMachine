package com.iml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iml.entity.inputData;

@Repository
public interface gameRepository extends JpaRepository<inputData, Integer>{

}
