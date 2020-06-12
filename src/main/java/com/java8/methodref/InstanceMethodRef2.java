package com.java8.methodref;

public class InstanceMethodRef2 {

	public void printMsg() {
		System.out.println("Hi,This is non-static method reference");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new InstanceMethodRef2()::printMsg);
		t2.start();

	}

}
