package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CreateAccount;


public interface SignUpRepository extends JpaRepository<CreateAccount, Long> {

	public Optional<CreateAccount> findByUsername(String username);

}
