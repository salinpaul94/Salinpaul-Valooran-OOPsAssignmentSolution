package com.greatLearning.services;

public class DriverClass {
	public static void main(String[] args) {
		
//		SuperDepartment SuperObject=new SuperDepartment();
//		System.out.println(SuperObject.departmentName());
//		System.out.println(SuperObject.getTodaysWork());
//		System.out.println(SuperObject.getWorkDeadline());
//		System.out.println(SuperObject.isTodayAHoliday());
		
		SuperDepartment AdminObject=new AdminDepartment();
		System.out.println(AdminObject.getTodaysWork());
		System.out.println(AdminObject.getWorkDeadline());
		System.out.println(AdminObject.isTodayAHoliday());
		
		HrDepartment HrObject=new HrDepartment();
		System.out.println(HrObject.doActivity());
		System.out.println(HrObject.getTodaysWork());
		System.out.println(HrObject.getWorkDeadline());
		System.out.println(HrObject.isTodayAHoliday());
		
		TechDepartment TechObject=new TechDepartment();
		System.out.println(TechObject.getTodaysWork());
		System.out.println(TechObject.getWorkDeadline());
		System.out.println(TechObject.getTechStackInformation());
		System.out.println(TechObject.isTodayAHoliday());
	}
}
