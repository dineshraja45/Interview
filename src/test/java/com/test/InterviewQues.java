package com.test;

import java.util.ArrayList;
import java.util.List;

public class InterviewQues {

public static void main(String[] args) {
		
		java.util.List<Integer> li=new ArrayList<Integer>(10);
		
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
		
		List<Integer> subList = li.subList(5, 10);
		for (int i = 0; i <subList.size(); i++) {
			Integer integer = subList.get(i);
			System.out.println(integer);
			
		}
}
}