package com.subeshan.assignment;

import com.subeshan.assignment.employee.Developer;
import com.subeshan.assignment.employee.employee;

public class AssignmentMain {

	public static void main(String[] args) {
		
		employee em=new employee();
		Developer dv=new Developer();
		System.out.println(em.getName());
		System.out.println(em.getEmlopyeeId());
		System.out.println(em.getSalary());
		System.out.println(dv.getStatus());
	}

}
