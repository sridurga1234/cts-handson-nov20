package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class TestMap {
	 
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		
		list1.add("stu1");
		list1.add("stu2");
		list2.add("stu3");
		list2.add("stu4");
		
		
		
		map.put("EC", list1);
		map.put("CS", list2);
		
		System.out.println(map);
	}

	
	}
