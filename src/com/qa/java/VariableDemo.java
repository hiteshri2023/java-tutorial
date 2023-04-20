package com.qa.java;

public class VariableDemo {
	int i=10;
	static int b=20;
public static void main(String[] args) {
		
	VariableDemo ob = new VariableDemo();
	System.out.println(ob.i);
	System.out.println(ob.b);
	ob.i=30;
	ob.b=40;
	System.out.println(ob.i);
	System.out.println(ob.b);
	
	VariableDemo ob1 = new VariableDemo();//it create new memory at every object
	System.out.println(ob1.i);
	System.out.println(ob1.b);//b is static variable share memory
	
	
	
	
		
		

	}

}
