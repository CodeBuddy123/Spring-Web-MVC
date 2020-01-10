package com.ashsoft.dao;

import com.ashsoft.entity.StudentEntity;

public interface StudentDao {
	public String add(StudentEntity studentEntity);
	public StudentEntity search(String sid);
	public String delete(String sid);

}
