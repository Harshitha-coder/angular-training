package com.xworkz.registeration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.registeration.entity.RegisterEntity;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer> {

}
