package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nit.entity.Student;
import com.nit.repository.IStudentRepo;

@Service
public class StudentImplService implements IStudentMgmtService {

	@Autowired
	private IStudentRepo studRepo;
	@Override
	public String registerStudent(Student student) {
		studRepo.save(student);
		return "Student Saved Successfully with Id "+student.getStudent_Id();
	}
	@Override
	public Student getSingleStudent(Integer id) {
		/*
		 * Optional<Student> sid = studRepo.findById(id); if(sid.isPresent()) {
		 * Optional<Student> list = studRepo.findById(id); return list; } else throw new
		 * IllegalArgumentException("given id is not found");
		 */
		return studRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Id is not found"));
	}
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studRepo.findAll();
	}
	@Override
	public String deleteById( @PathVariable Integer id) {
		Optional<Student> opt=studRepo.findById(id);
		if(opt.isPresent())
		{
			studRepo.deleteById(id);
			return "Student is deleted Successfully with id "+id;
		}
		else
			throw new IllegalArgumentException("Id is not found");
	}

}
