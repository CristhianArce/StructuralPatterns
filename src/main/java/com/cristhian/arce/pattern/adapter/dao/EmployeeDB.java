package com.cristhian.arce.pattern.adapter.dao;

import com.cristhian.arce.pattern.adapter.contracts.Employee;

public class EmployeeDB implements Employee {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;

	public EmployeeDB(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
