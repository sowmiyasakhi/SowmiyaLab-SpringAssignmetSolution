package com.greatlearning.studentcollegefest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.greatlearning.studentcollegefest.entity.Student;
import com.greatlearning.studentcollegefest.service.StudentService;

@Controller
//@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		System.out.println("The controller class");
	}
	
	@GetMapping("/list")
	public String getStudents(Model theModel) {
		System.out.println("list");
		List<Student> theStudent = studentService.findAll();
		theModel.addAttribute("Student",theStudent);
		return "studentlist";
	}
	

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		
		Student theStudent = new Student();

		theModel.addAttribute("Student", theStudent);

		return "studentform";
	}

	@PostMapping("/save")
	public void saveStudent(@RequestBody Student theStudent)
			 {
		studentService.save(theStudent);
	}

	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam("id") int id) {
		studentService.DeleteById(id);
	}
	
	
}
