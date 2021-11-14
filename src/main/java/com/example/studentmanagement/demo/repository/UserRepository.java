package com.example.studentmanagement.demo.repository;


import com.example.studentmanagement.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}