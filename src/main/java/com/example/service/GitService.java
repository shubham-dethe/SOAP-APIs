package com.example.service;

import java.util.List;

import com.example.entity.Git;

public interface GitService {
	
	public void addGit(Git git);
	
	public Git getGit(int id);
	
	public List<Git> getAllGit();
	
	

}
