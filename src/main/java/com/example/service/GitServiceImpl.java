package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.dto.RequestGitDto;
import com.example.dto.ResponseGitDto;
import com.example.entity.Git;
import com.example.repository.GitRepo;

@Service
public class GitServiceImpl implements GitService {

	@Autowired
	private GitRepo gitRepo;

	@Override
	public void addGit(RequestGitDto requestGitDto) {

		Git git = new Git();

		git.setName(requestGitDto.getName());
		git.setCity(requestGitDto.getCity());
		git.setNum(requestGitDto.getNum());
		git.setGender(requestGitDto.getGender());
		gitRepo.save(git);

	}

	@Override
	public ResponseGitDto getGit(int id) {

		Optional<Git> gitOptional = gitRepo.findById(id);

		if (gitOptional.isEmpty()) {
			throw new GitServiceException("ID doesnt exist", HttpStatus.NOT_FOUND);
		}

		Git git = gitOptional.get();
		ResponseGitDto responseGitDto = new ResponseGitDto();

		responseGitDto.setName(git.getName());

		return responseGitDto;
	}

	@Override
	public List<Git> getAllGit() {

		return gitRepo.findAll();
	}

}
