package com.java.java8features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataTimeMain {

    public static void main(String[] args) {


        Instant time = Instant.now();
        System.out.println(time);

        ZoneId indiaTimeZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime istDateTime = time.atZone(indiaTimeZone);
        System.out.println(istDateTime);

        System.out.println("Current Time (Indian Standard Time - IST): " + formatDateTime(istDateTime.toLocalDateTime()));

    }
    private static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
