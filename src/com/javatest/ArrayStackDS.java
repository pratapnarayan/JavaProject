package com.javatest;

/*Implement a stack data structure using arrays in Java, including push, pop, and isEmpty operations.*/

public class ArrayStackDS {
	
	private int maxSize;
	private int[] arrayStack;
	private int top = -1;
	
	

	public ArrayStackDS(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.arrayStack = new int[maxSize];
		this.top = -1;
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack overflow : Can not push element "+element);
			return;
		}
		arrayStack[++top] = element;
		System.out.println("Element pushed : "+element);
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack unerflow : Cannot pop elements");
			return -1;
		}
		int poppedElement = arrayStack[top--];
		System.out.println("Popped Element : "+poppedElement);
		return poppedElement;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack unerflow : Cannot peek elements");
			return -1;
		}
		return arrayStack[top];
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == maxSize -1;
	}



	public static void main(String[] args) {
		ArrayStackDS arrayStack = new ArrayStackDS(5);
		arrayStack.push(1);
		arrayStack.push(2);
		arrayStack.push(3);
		arrayStack.push(4);
		arrayStack.push(55);
		
		System.out.println("Top Element of stack : "+arrayStack.peek());
		
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		
		System.out.println("Top Element of stack : "+arrayStack.peek());
	}

}
