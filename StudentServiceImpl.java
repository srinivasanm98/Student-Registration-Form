package com.pack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.StudentDao;
import com.pack.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void insertStudent(Student stud) {
		
		studentDao.insertStudent(stud);
		
	}

	@Override
	public List<Student> fetchAllStudent() {
		
		List<Student> stulist=studentDao.fetchAllStudent();
		return stulist;
	}

	@Override
	public void deleteStudent(int studId) {
		
		studentDao.deleteStudent(studId);
		
	}

	@Override
	public Student fetchStudentById(Integer studId) {
		Student stu=studentDao.fetchStudentById(studId);
		
		return stu;
	}

	@Override
	public void updateStudent(Student stu) {
		studentDao.updateStudent(stu);
		
	}
}
