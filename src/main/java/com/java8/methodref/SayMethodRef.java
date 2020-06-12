package com.java8.methodref;

class SayMethodRef{
	public static void someThingSay() {
		System.out.println("Hi,This is Static Method");
	}
	public static void main(String[] args) {
		Sayable sayable=SayMethodRef::someThingSay;
		sayable.say();
	}
}
