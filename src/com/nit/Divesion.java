package com.nit;

public class Divesion {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a/b;
	//	System.out.println(c);
		
		String day = IO.readln("Enter the day");	
	String weakday = weekday(day);
	System.out.println(weakday);
	}
	static String weekday(String day) {
	
		if(day=="monday") { 
			return "monday";
		}else if(day=="tuesday") {
			return "tuesday";
		}
		
		return "method executed";
	}
}
