package ua.lviv.lgs.max;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ApplicationDateTime {
	public static void main(String[] args) {
		Date d = new Date();

		System.out.println(d);

		System.out.println();
		
		System.out.println("Converted to localDate ----> " + convertToLocalDate(d));

		System.out.println();

		System.out.println("Converted to localDateTime ----> " + convertToLocalDateTime(d));
		
		System.out.println();

		System.out.println("Converted to localTime ----> " + convertToLocalTime(d));
	}

	public static LocalDate convertToLocalDate(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalTime convertToLocalTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

	public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

}
