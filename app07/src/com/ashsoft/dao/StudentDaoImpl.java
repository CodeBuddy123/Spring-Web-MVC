package com.ashsoft.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.ashsoft.dto.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	String status="";
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public String add(String sid, String sname, String saddr) {
		
		String query1="select * from students where SID='"+sid+"'";
		List<Student>list=jdbcTemplate.query(query1, (rs,i)->{
			Student std= new Student();
			std.setSid(rs.getString("SID"));
			std.setSname(rs.getString("SNAME")); //transferring data from ResultSet to StudentBean
			std.setSaddr(rs.getString("SADDR"));
			return std;                    
		});
		if(list.isEmpty()) //inserting the record if student is not existed
		{
			String query2="insert into students values('"+sid+"','"+sname+"','"+saddr+"')";
			int rowCount=jdbcTemplate.update(query2);
			if(rowCount==1)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		}
		else //returning the status message as 'existed', if student already exists in database
		{
			status="existed";
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		
		Student student=null;
		
		String query="select * from students where SID='"+sid+"'";
		List<Student>list=jdbcTemplate.query(query, (rs,i)->{
			Student std=new Student();
			std.setSid(rs.getString("SID"));
			std.setSname(rs.getString("SNAME"));
			std.setSaddr(rs.getString("SADDR"));
			return std;
		});
		if(list.isEmpty())
		{
			student=null;
		}
		else
		{
			student=list.get(0);        //if student exists,its available at 0th index in list
		}
		return student;
	}

	@Override
	public String update(String sid, String sname, String saddr) {
		
		String status="";
		String query="update students set SNAME='"+sname+"',SADDR='"+saddr+"' where SID ='"+sid+"'";
		
		int rowCount=jdbcTemplate.update(query);
		if(rowCount==1)
		{
			status="success";
		}
		else
		{
			status="failure";
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		
		String status="";
		Student std=search(sid);     //using the search module to search the student
		
		if(std==null)
		{
			status="not existed";
		}
		else
		{
			int rowCount=jdbcTemplate.update("delete from students where SID='"+sid+"'");
			if(rowCount==1)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		}
		return status;
	}

}
