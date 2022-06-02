package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;


public class GenericDemo {
	
	public static void main(String[] args) {
	 //List marks =  new ArrayList();
	//List <Integer>marks= new ArrayList();
		List<String>marks = new ArrayList();
		
		/*marks.add(98);
		marks.add(95);
		marks.add(9);
		marks.add(14);*/
		
		
		marks.add("ABC");
		marks.add(null);
		marks.add("Divya");
		marks.add("kalyani");
		marks.add("D");
		System.out.println(marks.size());
	
		//marks.add(false);
		
		System.out.println(marks);
	}
	
	

}
