package com.cristhian.arce.pattern.adapter;

import com.cristhian.arce.pattern.adapter.dto.EmployeeClient;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient employeeClient = new EmployeeClient();
		System.out.println(employeeClient.getEmployeeList());
	}

}
