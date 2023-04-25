package com.example.facebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.model.FaceBook;
import com.example.facebook.repository.FaceBookRepository;

@RestController
public class FaceBookController
{
	@Autowired
	FaceBookRepository fbr;
	@GetMapping("/facebook")
	public List<FaceBook> getAllDetails()
	{
		return fbr.findAll();
	}
	@GetMapping("/facebook/{regNo}")
	public FaceBook getDetailsById(@PathVariable int regNo)
	{
		return fbr.findById(regNo).orElse(null);
	}
}
