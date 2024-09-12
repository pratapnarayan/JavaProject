package com.javatest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

/*
 * Find the total number of employees in the company.
Calculate the average salary of all employees.
Identify the employee with the highest salary.
Filter employees based on years of experience and count the number of employees with more than 5 years of experience.
 * 
 * */

public class EmployeeStream {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
			emp.add(new Employee(101, "Alice", "HR", 50000, 4));
			emp.add(new Employee(102, "Bob", "IT", 60000, 6));
			emp.add(new Employee(103, "Carol", "HR", 55000, 5));
			emp.add(new Employee(104, "David", "IT", 62000, 8));
			emp.add(new Employee(105, "Eva", "Finance", 70000, 7));
			
			//Find the total number of employees in the company.
			System.out.println(emp.stream().count());
			
			//Calculate the average salary of all employees.
			System.out.println(emp.stream().mapToInt(Employee :: getSalary).average());
			//Identify the employee with the highest salary.
			System.out.println(emp.stream().max(Comparator.comparing(Employee :: getSalary)).get());
			
			//Filter employees based on years of experience and count the number of employees with more than 5 years of experience.
			System.out.println(emp.stream().filter(employee -> employee.getExperience() > 5).count());

	}

}
