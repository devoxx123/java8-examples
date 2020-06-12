package com.java8.joeyajames.streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

	public static void main(String[] args) {
		System.out.println(formatter.format(LocalDate.parse("16/08/2016", formatter)));
	}

}
