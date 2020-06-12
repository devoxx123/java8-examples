package com.java8.dates;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampExample {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	public static void main(String[] args) {
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Time Stamp --> " + timeStamp);

		Date date = new Date();
		System.out.println("Date TimeStamp --> " + new Timestamp(date.getTime()));

		System.out.println(timeStamp.getTime());

		System.out.println(sdf.format(timeStamp));

	}

}
