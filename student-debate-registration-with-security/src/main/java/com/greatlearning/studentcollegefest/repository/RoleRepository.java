package com.greatlearning.studentcollegefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.studentcollegefest.entity.Role;




public interface RoleRepository extends JpaRepository<Role,Integer> {
   
}