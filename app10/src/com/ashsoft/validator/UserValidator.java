package com.ashsoft.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ashsoft.command.User;

public class UserValidator implements Validator {

		
	@Override
	public boolean supports(Class<?> cls) {
		
		return User.class.isAssignableFrom(cls); //returns true if User class exists for validation
	}

	@Override
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors,"uname", "uname.required"); //errors,var_name,key inside properties file
		ValidationUtils.rejectIfEmpty(errors, "upwd", "upwd.required");
		ValidationUtils.rejectIfEmpty(errors, "uage", "uage.required");        //Validation for empty data provided in form
		ValidationUtils.rejectIfEmpty(errors, "uemail", "uemail.required");
		ValidationUtils.rejectIfEmpty(errors, "umobile", "umobile.required");
		
		User user=(User)command;
		
		if(!user.getUpwd().equals("") && user.getUpwd().length()<5)
		{
			errors.rejectValue("upwd","upwd.minLength");
		}
		if(!user.getUpwd().equals("") && user.getUpwd().length()>10)
		{
			errors.rejectValue("upwd","upwd.maxLength");
		}
		if(user.getUage()<18 || user.getUage()>30)
		{
			errors.rejectValue("uage","uage.range");
		}
		if(!user.getUemail().equals("") && !user.getUemail().contains("@"))
		{
			errors.rejectValue("uemail","uemail.invalid");
		}
		if(!user.getUmobile().equals("") && !user.getUmobile().startsWith("91-"))
		{
			errors.rejectValue("umobile","umobile.invalid");
		}
	}

}
