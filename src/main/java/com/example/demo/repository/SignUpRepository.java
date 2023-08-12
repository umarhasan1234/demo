package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;

@Repository
public interface SignUpRepository extends JpaRepository<Login, Long> {

	public Optional<Login> findByUsername(String username);

}
