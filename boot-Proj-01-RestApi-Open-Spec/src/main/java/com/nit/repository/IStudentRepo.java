package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
