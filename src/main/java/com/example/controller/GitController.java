package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Git;
import com.example.service.GitService;

@RestController
@RequestMapping("/git")
public class GitController {
	
	@Autowired
	GitService service;
	
	@PostMapping
	public void addData(@RequestBody Git git) {
		
		service.addGit(git);
		
	}
	
	@GetMapping("/{id}") 
	public Git getData (@PathVariable int id){
		return service.getGit(id);
		
	}
	
	@GetMapping 
	public List<Git> getAllData (){
		return service.getAllGit();
		
	}

	
	//do this using the terminal 
}
