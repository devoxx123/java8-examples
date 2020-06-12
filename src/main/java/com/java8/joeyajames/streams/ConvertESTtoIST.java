package com.java8.joeyajames.streams;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertESTtoIST {

	static DateTimeFormatter globalFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma z");
	static DateTimeFormatter estFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'ET'");

	static ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
	static ZoneId estZoneId = ZoneId.of("America/New_York");

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();

		ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
		ZonedDateTime currentESTime = currentISTime.withZoneSameInstant(estZoneId);

		System.out.println("Indian DateFormat " + globalFormatter.format(currentISTime));
		System.out.println("American DateFormat " + estFormatter.format(currentESTime));

	}

}
