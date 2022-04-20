package com.example.demo.repository;

import com.example.demo.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User2,Integer>{
}
