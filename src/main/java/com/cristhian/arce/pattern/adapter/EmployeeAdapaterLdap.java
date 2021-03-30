package com.cristhian.arce.pattern.adapter;

import com.cristhian.arce.pattern.adapter.contracts.Employee;
import com.cristhian.arce.pattern.adapter.dao.EmployeeLdap;

public class EmployeeAdapaterLdap implements Employee {
	
	private EmployeeLdap instance;
	
	public EmployeeAdapaterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurname();
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}

}
