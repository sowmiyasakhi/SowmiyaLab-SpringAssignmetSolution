package com.greatlearning.studentcollegefest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentcollegefest.entity.Student;
import com.greatlearning.studentcollegefest.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		List<Student> student = studentRepository.findAll();
		return student;
	}

	
	@Override
	public String save(Student theStudent) {
		studentRepository.save(theStudent);
		return "Student saved";
	}

	@Override
	public String DeleteById(int id) {
		studentRepository.deleteById(id);
		return "Student with" +id +" deleted";
	}


	@Override
	public Optional<Student> FindById(int id) {
		
		return studentRepository.findById(id) ;
	}


}
