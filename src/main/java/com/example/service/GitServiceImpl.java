package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Git;
import com.example.repository.GitRepo;

@Service
public class GitServiceImpl implements GitService {

	@Autowired
	private GitRepo gitRepo;
	
	
	@Override
	public void addGit(Git git) {
		gitRepo.save(git);
		
	}

	@Override
	public Git getGit(int id) {
		
		return gitRepo.findById(id).get();
	}

	@Override
	public List<Git> getAllGit() {
		
		return gitRepo.findAll();
	}

}
