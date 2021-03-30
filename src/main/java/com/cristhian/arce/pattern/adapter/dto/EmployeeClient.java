package com.cristhian.arce.pattern.adapter.dto;

import java.util.ArrayList;
import java.util.List;

import com.cristhian.arce.pattern.adapter.contracts.Employee;
import com.cristhian.arce.pattern.adapter.dao.EmployeeCSV;
import com.cristhian.arce.pattern.adapter.dao.EmployeeDB;
import com.cristhian.arce.pattern.adapter.dao.EmployeeLdap;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employeeFromDB  = new EmployeeDB("1234", "Cristhian", "Arce", "cristhian@arce.com");
		employees.add(employeeFromDB);
		
//		Employee employeeFromLdap = new EmployeeLdap("5678", "Han", "Solo", "han@solo.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("5678", "Han", "Solo", "han@solo.com");
		employees.add(new EmployeeAdapaterLdap(employeeFromLdap));
		
		EmployeeCSV employeeCSV = new EmployeeCSV(9098, "Daniela", "Rojas", "dani@rojas.com");
		employees.add(new EmployeeAdapterCSV(employeeCSV));
		
		return employees;
	}

}
