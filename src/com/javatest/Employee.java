package com.javatest;

/*
 * You have a list of Employee objects representing employees in the company.
Each Employee object contains information such as the employee ID, name, department, salary, and years of experience.
Write a Java program to perform the following tasks using Java 8 streams:

Find the total number of employees in the company.
Calculate the average salary of all employees.
Identify the employee with the highest salary.
Filter employees based on years of experience and count the number of employees with more than 5 years of experience.
 * */

public class Employee {

	private int employeeID;
	private String name;
	private String department;
	private int salary;
	private int experience;

	public Employee(int employeeID, String name, String department, int salary, int experience) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.experience = experience;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", department=" + department + ", salary="
				+ salary + ", experience=" + experience + "]";
	}

}
