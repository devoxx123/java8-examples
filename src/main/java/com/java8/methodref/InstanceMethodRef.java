package com.java8.methodref;

public class InstanceMethodRef {
	public void sayInstanceMethodRef() {
		System.out.println("Hi , This is Instance Method Refernce");
	}

	public static void main(String[] args) {
		InstanceMethodRef instanceMethodRef = new InstanceMethodRef();
		Sayable sayable = instanceMethodRef::sayInstanceMethodRef;
		sayable.say();
		Sayable sayable2 = new InstanceMethodRef()::sayInstanceMethodRef;
		sayable2.say();
	}
}
