package com.ashsoft.command;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;




public class User {
	@NotEmpty(message = "User Name is Required")
	private String uname;
	
    @NotEmpty(message = "User Password is Required")
    @Size(min = 6,max = 10, message = "User Password must be minimum 6 characters and maximum 10 characters")
	private String upwd;
	
    @NotNull(message = "User Age is Required")
    @Range(min = 18,max = 25,message = "User Age range is between 18 to 25")
	private int uage;
	
	@NotNull(message = "User Date of Birth is Required")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past(message = "User Date of Birth must be Past date")
	private Date udob;
	
	@NotEmpty(message = "User Email is Required")
	@Email
	private String uemail;
	
	@NotEmpty(message = "User Mobile no is Required")
	@Pattern(regexp = "91-[0-9] {10}",message = "User Mobile must be 91-DDDDDDDDDD format")
	private String umobile;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public Date getUdob() {
		return udob;
	}
	public void setUdob(Date udob) {
		this.udob = udob;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
}
