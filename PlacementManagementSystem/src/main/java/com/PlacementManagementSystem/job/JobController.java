package com.PlacementManagementSystem.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.PlacementManagementSystem.appliedJobs.AppliedJobService;
import com.PlacementManagementSystem.appliedJobs.AppliedJobs;

@Controller
public class JobController {

	@Autowired
	private JobService jbService;
	
	String name=" misba";
	@Autowired
	private AppliedJobService appliedS;
	@GetMapping("/")
	public String dashBoard()
	{
		return "home";
	}
	
	@GetMapping("/allJobs")
	public ModelAndView getAllJObs()
	{
		List<JobPost> list=jbService.getAllJobs();
		return new ModelAndView("JobList","job",list);
	}
	
	@GetMapping("/Register")
	public String NewJob()
	{
		return "newJob";
	}
	
	@PostMapping("/save")
	public String addJob(@ModelAttribute JobPost job)
	{
		jbService.sava(job);
		return "redirect:/allJobs";
	}
	
	@RequestMapping("/add/{id}")
	public String applyForJob(@PathVariable("id") int id)
	{
		JobPost j=jbService.getJob(id);
		AppliedJobs job=new AppliedJobs(j.getId(),j.getCompany(),j.getRole(),name);
		appliedS.save(job);
		return "redirect:/myjobs";
	}
	@RequestMapping("/myjobs")
	public ModelAndView getMyJobs()
	{
		List<AppliedJobs> list=appliedS.getjobs();
		return new  ModelAndView("myJobs","applied",list);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteMyJob(@PathVariable("id") int id)
	{
		appliedS.deleteJobs(id);
		return "redirect:/myjobs";
	}
	
	@GetMapping("/resources")
	public String getResources()
	{
		return "Resources";
	}
	
	@RequestMapping("/deleteJob/{id}")
	public String deleteJob(@PathVariable("id") int id)
	{
		jbService.delteJob(id);
		return "redirect:/allJobs";
	}
	
	@GetMapping("/user")
	public String getProfile()
	{
		return "profile";
	}
	
	
}
