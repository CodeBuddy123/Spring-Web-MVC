package com.ashsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashsoft.command.Student;
import com.ashsoft.dao.StudentDao;
import com.ashsoft.entity.StudentEntity;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	@Override
	public String addStudent(Student std) {
		
		StudentEntity studentEntity= new StudentEntity();
		studentEntity.setSid(std.getSid());
		studentEntity.setSname(std.getSname()); //transferring data  from spring web mvc student object to ORM studententity object
		studentEntity.setSaddr(std.getSaddr());
		
		String status=studentDao.add(studentEntity);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		StudentEntity studentEntity=studentDao.search(sid);
		Student student=null;
		if(studentEntity==null)
		{
			student=null;
		}
		else
		{
			student= new Student();
			student.setSid(studentEntity.getSid());
			student.setSname(studentEntity.getSname());
			student.setSaddr(studentEntity.getSaddr());
		}
		return student;
	}
	@Transactional
	@Override
	public String deleteStudent(String sid) {
		String status=studentDao.delete(sid);
		return status;
	}

}
