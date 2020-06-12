package com.java8.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class compateDates {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = simpleDateFormat.parse("2019-12-31");
		Date date2 = simpleDateFormat.parse("2019-12-31");

		System.out.println("Date1 : " + simpleDateFormat.format(date1));
		System.out.println("Date2 : " + simpleDateFormat.format(date2));

		if (date1.after(date2)) {
			System.out.println("Date1 is after Date2");
		} else if (date1.before(date2)) {
			System.out.println("Date1 is before Date2");
		} else if (date1.equals(date2)) {
			System.out.println("Date1 is equals to Date2");
		} else {
			System.out.println("We Got here !");
		}

	}

}
