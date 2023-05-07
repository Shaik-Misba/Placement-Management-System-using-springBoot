package com.PlacementManagementSystem.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
		
	@Autowired
	private JobRepository jbRepo;
	
	public void sava(JobPost job)
	{
		jbRepo.save(job);
	}
	
	public List<JobPost> getAllJobs()
	{
		return jbRepo.findAll();
	}
	
	public JobPost getJob(int id)
	{
		return jbRepo.findById(id).get();
	}
	
	public void delteJob(int id)
	{
		jbRepo.deleteById(id);
	}
}
