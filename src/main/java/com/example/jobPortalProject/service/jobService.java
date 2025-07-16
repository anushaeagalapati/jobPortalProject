package com.example.jobPortalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobPortalProject.Repo.jobRepo;
import com.example.jobPortalProject.model.JobPost;

@Service
public class jobService {

	@Autowired
	public jobRepo repo;
	
	public void addJob(JobPost job) {
		repo.addjob(job);
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
	}
	
 }
