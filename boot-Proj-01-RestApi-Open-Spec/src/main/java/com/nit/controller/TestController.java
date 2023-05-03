package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Student;
import com.nit.service.IStudentMgmtService;

@RestController
@RequestMapping("/student")
public class TestController 
{
	@Autowired
	private IStudentMgmtService service;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String addStudent(@RequestBody Student student)
	{
		return service.registerStudent(student);
	}
	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Student getStudentById(@PathVariable Integer id)
	{
		return service.getSingleStudent(id);
	}
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> fetchAllStudents()
	{
		return service.getAllStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String removeById(@PathVariable Integer id)
	{
		return service.deleteById(id);
	}

}
