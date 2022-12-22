package com.test;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		
		java.util.List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		
		
		for (int i = 5; i < li.size(); i++) {
			Integer integer = li.get(i);
			System.out.println(integer);
		}
		
		
		
		}


}
