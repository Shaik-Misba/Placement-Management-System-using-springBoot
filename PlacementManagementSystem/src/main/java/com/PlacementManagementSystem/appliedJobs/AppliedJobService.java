package com.PlacementManagementSystem.appliedJobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppliedJobService {

	@Autowired
	private AppliedJobRepository ARepo;
	
	public void save(AppliedJobs job)
	{
		ARepo.save(job);
	}
	
	public List<AppliedJobs> getjobs()
	{
		return ARepo.findAll();
	}
	
	public void deleteJobs(int id)
	{
		ARepo.deleteById(id);
	}
}
