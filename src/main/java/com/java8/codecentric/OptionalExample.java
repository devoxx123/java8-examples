package com.java8.codecentric;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		optionalTypes();
		isPresent();
		ifPresent();
		orElse();
		orElseThrow();
		get();
		withFilter();
		withMap();

	}

	private static void optionalTypes() {
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> of = Optional.of("Hari");
		System.out.println(of);
		Optional<String> ofNullable = Optional.ofNullable(null);
		System.out.println(ofNullable);

	}

	private static void isPresent() {
		System.out.println(Optional.of("String").isPresent());
		// System.out.println(Optional.of(null).isPresent());Produce
		// NullPointerException
		System.out.println(Optional.ofNullable(null).isPresent());

	}

	private static void ifPresent() {
		Optional<String> optionalValue = Optional.of("Hari");
		optionalValue.ifPresent(x -> System.out.println(optionalValue.isPresent()));

	}

	private static void orElse() {
		String nullValue = null;
		String value = Optional.ofNullable(nullValue).orElse("hari");
		System.out.println(value);

	}

	private static void orElseThrow() {
		String nullValue = null;
		// Optional.ofNullable(nullValue).orElseThrow(IllegalStateException::new);

	}

	private static void get() {
		Optional<String> optionalGet = Optional.of("Hari");
		String optioanlResult = optionalGet.get();
		System.out.println(optioanlResult);

	}

	private static void withFilter() {
		Integer year=2020;
		Optional<Integer>isYearOptional=Optional.of(year);
		boolean is2019=isYearOptional.filter(x->x==2019).isPresent();
		System.out.println(is2019);
		boolean is2018=isYearOptional.filter(x->x==2018).isPresent();
		System.out.println(is2018);
		
	}

	private static void withMap() {
		  List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
	        Optional<List<String>> listOptional = Optional.of(companyNames);
	        int size=listOptional.map(List::size).orElse(0);
	        System.out.println("Company Size : " + size);
	        
	               /*  (((((OR)))))*/
	        
	        String password="abc1234";
	        Optional<String>passOpt=Optional.of(password);
	        boolean currentPwd=passOpt.filter(pass->pass.equals(password)).isPresent();
	        System.out.println("Current Password : " + currentPwd);
	        
	                /*((((((OR))))))*/
	        
	        currentPwd=passOpt.map(String::trim).filter(pass->pass.equals(password)).isPresent();
	        System.out.println("Password Correct : " + currentPwd);
	        
	        		

	}

}
