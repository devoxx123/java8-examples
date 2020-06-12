package com.java8.codecentric;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method=Parameter.class.getMethod("main", String[].class);
        for(Parameter parameter:method.getParameters()) {
        	System.out.println("Parameter : " + parameter.getName());
        }
		
	}

}
