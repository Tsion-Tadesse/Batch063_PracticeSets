package com.practicepart2.repository;

import com.practicepart2.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClass extends JpaRepository<EntityClass, Integer>{
	
}
