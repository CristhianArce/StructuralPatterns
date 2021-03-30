package com.cristhian.arce.pattern.adapter;

import com.cristhian.arce.pattern.adapter.contracts.Employee;
import com.cristhian.arce.pattern.adapter.dao.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {
	
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return String.valueOf(instance.getId());
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastName();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailAddress();
	}

}
