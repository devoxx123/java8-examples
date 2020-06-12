package com.java8.dates;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ConvertDateToJavaTime {

	public static void main(String[] args) {
		ZoneId defaultZoneId=ZoneId.systemDefault();
		System.out.println("System Default TimeZone:" + defaultZoneId);
		
		Date date=new Date();
		System.out.println("Date: " + date);
		
		Instant instant=date.toInstant();
		System.out.println("Instant: " + instant);
		
		/*Convert Date To LocalDate*/
		LocalDate localDate=instant.atZone(defaultZoneId).toLocalDate();
		System.out.println("LocalDate: " + localDate);
		
		/*Convert Date To LocalDateTime*/
		LocalDateTime localDateTime=instant.atZone(defaultZoneId).toLocalDateTime();
		System.out.println("LocalDateTime: " + localDateTime);
		
		/*Convert Date To ZoneDateTime*/
		ZonedDateTime zonedDateTime=instant.atZone(defaultZoneId);
		System.out.println("ZonedDateTime: " + zonedDateTime);
		
		DayOfWeek days=DayOfWeek.FRIDAY;
		System.out.println(days.getValue());
		
		LocalDate dates=LocalDate.now();
		System.out.println(dates.with(DayOfWeek.FRIDAY));

	}

}
