package com.pack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.pack.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertStudent(Student stu) {
		
		sessionFactory.getCurrentSession().save(stu);
		
	}

	@Override
	public List<Student> fetchAllStudent() {
		Query query=sessionFactory.getCurrentSession().createQuery("select s from Student s");
		List slist=query.list();
		return slist;
	}

	@Override
	public void deleteStudent(int studId) {
		Student stu=(Student)sessionFactory.getCurrentSession().get(Student.class,studId);
		sessionFactory.getCurrentSession().delete(stu);
		
	}

	@Override
	public Student fetchStudentById(Integer studId) {
		Student stu=(Student)sessionFactory.getCurrentSession().get(Student.class,studId);
		return stu;
	}

	@Override
	public void updateStudent(Student stu) {
		
		sessionFactory.getCurrentSession().update(stu);
		
	}

	
}
