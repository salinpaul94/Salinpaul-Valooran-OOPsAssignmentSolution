package com.greatLearning.services;

import com.greatLearning.module.DepartmentParameters;

public class SuperDepartment {
	
	//Creating an object of DeparamentParameters to access getter and setter method
	DepartmentParameters department=new DepartmentParameters();
	
	public String departmentName(){
		department.setDepartmentName("Super Department");
		return department.getDepartmentName();
	}
	
	public String getTodaysWork() {
		department.setGetTodaysWork("No work as of now");
		return department.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		department.setGetWorkDeadline("Nil");
		return department.getGetWorkDeadline();
	}
	
	public String isTodayAHoliday() {
		department.setIsTodayAHoliday("Today is not a holiday");
		return department.getIsTodayAHoliday();
	}
}

class AdminDepartment extends SuperDepartment{
	
	public AdminDepartment() {
		System.out.println("\nWelcome to Admin Department");
	}
	public String departmentName(){
		department.setDepartmentName("Admin Department");
		return department.getDepartmentName();
		}
	public String getTodaysWork() {
		department.setGetTodaysWork("Complete your documents Submission");
		return department.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		department.setGetWorkDeadline("Complete by EOD");
		return department.getGetWorkDeadline();
	}
}

class HrDepartment extends SuperDepartment{
	public HrDepartment(){
		System.out.println("\nWelcome to Hr Depratment");
	}
	public String departmentName(){
		department.setDepartmentName("Hr Department");
		return department.getDepartmentName();
		}
	public String doActivity() {
		department.setDoActivity("Team Lunch");
		return department.getDoActivity();
	}
	public String getTodaysWork() {
		department.setGetTodaysWork("Fill today’s worksheet and mark your attendance");
		return department.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		department.setGetWorkDeadline("Complete by EOD");
		return department.getGetWorkDeadline();
	}
}

class TechDepartment extends SuperDepartment{
	public TechDepartment() {
		System.out.println("\nWelcome to Tech Department");
	}
	public String departmentName(){
		department.setDepartmentName("Tech Department");
		return department.getDepartmentName();
	}
	public String getTodaysWork() {
		department.setGetTodaysWork("Complete coding of module 1");
		return department.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		department.setGetWorkDeadline("Complete by EOD");
		return department.getGetWorkDeadline();
	}
	
	public String getTechStackInformation(){
		department.setGetTechStackInformation("core Java");
		return department.getGetTechStackInformation();
	}
}