package com.java8.dates;

import java.time.LocalDate;
import java.time.Period;

public class CheckDate {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate newDate = LocalDate.of(2019, 10, 14);
		System.out.println("Current Date " + currentDate);
		System.out.println("New Date " + newDate);

		Period period = Period.between(currentDate, newDate);
		System.out.println("Months --> " + period.getMonths());
		if (period.getMonths() <= -6) {
			System.out.println("Date: " + newDate + " is older than 6 months!");
		}
	}

}
