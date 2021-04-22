package com.pack.service;

import java.util.List;


import com.pack.model.Student;

public interface StudentService {
	
	public void insertStudent(Student stud);
	
	public List<Student> fetchAllStudent();

	public void deleteStudent(int studId);
	
	public Student fetchStudentById(Integer studId);

	public void updateStudent(Student stu);
}
