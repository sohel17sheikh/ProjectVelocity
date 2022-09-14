package com.velocity.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sagar","Sawant","Sushil","Vinod");
		
		Iterator<String> itr = list.iterator();
		for(String str :list) {
			System.out.println(str);
		}
	}

}
