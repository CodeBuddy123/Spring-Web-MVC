package com.ashsoft.service;

import com.ashsoft.command.Student;

public interface StudentService {
	public String addStudent(Student std);
	public Student searchStudent(String sid);
	public String deleteStudent(String sid);
}
