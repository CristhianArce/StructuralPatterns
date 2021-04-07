package com.cristhian.arce.pattern.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEveryDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> personAttributes = new HashMap<String, String>();
		personAttributes.put("site_role", "person");
		personAttributes.put("acces_role", "limited");
		
		
		Map<String, String> groupAttributes = new HashMap<String, String>();
		groupAttributes.put("group_role", "claims");
		
		
		Map<String, String> secAttributes = new HashMap<String, String>();
		
		secAttributes.putAll(personAttributes);
		secAttributes.putAll(groupAttributes);
		
		System.out.println(secAttributes);

	}

}
