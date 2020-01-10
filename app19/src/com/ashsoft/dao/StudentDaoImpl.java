package com.ashsoft.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.ashsoft.entity.StudentEntity;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	

    @Autowired
	private HibernateTemplate hibernateTemplate;
    
	@Override
	public String add(StudentEntity studentEntity) {
		String status="";
		try {
			StudentEntity stdEntity=search(studentEntity.getSid());
			if(stdEntity==null)
			{
				String pk_Val=(String) hibernateTemplate.save(studentEntity);
				if(pk_Val.equals(studentEntity.getSid()))
				{
					status="Student Inserted Successfully";
				}
				else
				{
					status="Student Insertion Failure";
				}
			}
			else
			{
				status="Student Existed Already.";			
			}
		} catch (Exception e) {
			status="Student Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public StudentEntity search(String sid) {
		StudentEntity studentEntity=null;
		try {
			 studentEntity=(StudentEntity) hibernateTemplate.get(StudentEntity.class,sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentEntity;
	}

	@Override
	public String delete(String sid) {
		String status="";
		try {
			StudentEntity studentEntity=search(sid);
			if(studentEntity==null)
			{
				status="Student not existed";
			}
			else
			{
				hibernateTemplate.delete(studentEntity);
				status="Student Deleted Successfully";
			}
		} catch (Exception e) {
			status="Student Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

}
