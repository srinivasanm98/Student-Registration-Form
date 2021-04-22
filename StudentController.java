package com.pack.controller;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.pack.model.Student;
import com.pack.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/")
	public String studentRegistrationPage(ModelMap map) {
		
		Student student=new Student();
		map.addAttribute("studentForm",student);
		return "StudentRegister";
	}
	@RequestMapping(value="/insertStud",method=RequestMethod.POST)
	public String saveStudent(@Validated @ModelAttribute("studentForm")Student stud,BindingResult result,ModelMap map) {
		
		String response="";
		if(result.hasErrors()) {
			response="StudentRegister";
			
		}
		else {
			
			Random r=new Random();
			int studid=r.nextInt(99999)+10000;
			stud.setStudentid(studid);
			studentService.insertStudent(stud);
			List<Student> stulist=studentService.fetchAllStudent();
			map.addAttribute("studentList",stulist);
			response="StudentSuccess";
		}
		
		return response;
		
}
	@RequestMapping(value="/deleteStu/{id}")
	public String deleteStudent(@PathVariable("id") Integer studId,ModelMap map) {
		
	
		studentService.deleteStudent(studId);
		List<Student> stulist=studentService.fetchAllStudent();
		map.addAttribute("studentList",stulist);
		return "StudentSuccess";
	}
	
	@RequestMapping(value="/fetchById/{sid}")
	public String fetchEmployeeById(@PathVariable("sid") Integer studId,ModelMap map) {
		
		
		Student student=studentService.fetchStudentById(studId);
		map.addAttribute("editForm",student);
		return "StudentUpdate";
	
	}
	@RequestMapping(value="/updateStu",method=RequestMethod.POST)
	public String updateEmployee(@Validated @ModelAttribute("editForm")Student stu,BindingResult result,ModelMap map) {
		
		String response="";
		if(result.hasErrors()) {
			response="StudentUpdate";
		}
		else {
			
			studentService.updateStudent(stu);
			List<Student> stulist=studentService.fetchAllStudent();
			map.addAttribute("studentList",stulist);
			return "StudentSuccess";
		}
		return response;
	}
	
}
