package com.variables;

public class Employee {
	int eid;
	String ename;
	double salary;
	public Employee()

	{
	}
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEid()
	{
		return this.eid;
	}

}
