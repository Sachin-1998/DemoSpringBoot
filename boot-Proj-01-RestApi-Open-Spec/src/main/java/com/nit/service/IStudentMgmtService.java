package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentMgmtService {

	public String registerStudent(Student student);
	public Student getSingleStudent(Integer id);
	public List<Student> getAllStudents();
	public String deleteById(Integer id);
}
