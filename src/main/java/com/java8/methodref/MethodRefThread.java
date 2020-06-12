package com.java8.methodref;

public class MethodRefThread {
	public static void someThing() {
		System.out.println("This is a Thread MethodRefernce");
	}
	public static void main(String[] args) {
		Thread thread=new Thread(MethodRefThread::someThing);
		thread.start();
	}

}
