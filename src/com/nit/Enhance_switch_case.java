package com.nit;
/**
 * we can use statement switch and expression switch yield both also we can use 
 */
public class Enhance_switch_case {
public static void main(String[] args) {
	
	int num = Integer.parseInt(IO.readln("enter the num").trim());
	String result1 = m1(num);
	String result2 = m2(num);
	
	System.out.println(result1);
	System.out.println(result2);
	
	
}

static String m1(int num) {
	
String res2  = switch(num) {
	
	case 1 ->{
		
		yield "monday";
	} 
	case 2 ->{
		
		yield "TuesDay";
	} 
	
	case 3 -> {
		
		yield "wesday";
	}
	default ->"invalid the value";
		
	};
	return res2;
}

static String m2(int num) {
	
String res2 = switch(num) {
	
	case 1:
		yield "monday";
	case 2:
		yield "TuesDay";
	case 3:
		yield "wesday";
		default :yield "invalid";
	};
	return res2;
}
	
}
