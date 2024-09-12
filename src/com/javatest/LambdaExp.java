package com.javatest;

import java.util.ArrayList;

interface FunctionalInterface {
	void abstractMethod(int x);
	
	default void normalMethod() {
		System.out.println("Normal Method");
	}
}

interface FuncInter1 {
	int operation(int a, int b);
}
interface FuncInter2 {
	void message(String message);
}


public class LambdaExp {
	
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}

public static void main(String[] args) {
		
	//Lambda Expression Example
		FunctionalInterface func = (int x)->System.out.println(3*x);
		func.abstractMethod(7);
		
		//Lambda Expression with single Parameter
		ArrayList<Integer> arrayL = new ArrayList<Integer>();
		arrayL.add(1);
		arrayL.add(2);
		arrayL.add(3);
		arrayL.add(4);
		arrayL.add(5);
		arrayL.add(6);
		
		//arrayL.forEach(n->System.out.println(n));
		
//		arrayL.forEach(n->{
//			if(n%2 == 0) {
//				System.out.println(n);
//			}
			
		//});
		
		//Multiple Parameters
		FuncInter1 add = (int x, int y)->x + y;
		FuncInter1 multiply = (int x, int y)->x*y;
		
		LambdaExp le = new LambdaExp();
		
		System.out.println("Addition of variables>>>>"+le.operate(7, 9, add));
		System.out.println("Mulltiplication of variables>>>>"+le.operate(7, 9, multiply));
		
		
	}

}
