package com.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

	public static void main(String[] args) {
		String format = "dd-MMM-yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String dateformat = "25-May-2020";
		LocalDate localDate = LocalDate.parse(dateformat, formatter);
		System.out.println("Convert String To LocalDate " + localDate);
		                 
		                /*  OR */
		String dateformat1 = "2020-05-25";
		LocalDate localDate1 = LocalDate.parse(dateformat1);
		System.out.println("Convert String To LocalDate " + localDate1);

	}

}
