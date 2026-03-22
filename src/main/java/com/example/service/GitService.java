package com.example.service;

import java.util.List;

import com.example.dto.RequestGitDto;
import com.example.entity.Git;

public interface GitService {
	
	public void addGit(RequestGitDto requestGitDto);
	
	public Git getGit(int id);
	
	public List<Git> getAllGit();
	
	

}
