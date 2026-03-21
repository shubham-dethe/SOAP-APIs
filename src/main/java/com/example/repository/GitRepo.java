package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Git;

public interface GitRepo extends JpaRepository<Git, Integer> {

}
