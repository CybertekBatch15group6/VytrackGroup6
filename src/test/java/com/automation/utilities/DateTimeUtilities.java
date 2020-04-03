package com.automation.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtilities {

    /**
     * MM - to specify month like: 01, 02, 03
     * MMM - Jan, Feb, Mar
     *
     * dd - to specify day like, 01, 02, 03
     *
     * yyyy - to specify year like: 2010, 2020
     *
     * @param format for example MMM dd, yyy
     * @return current date as a String
     **/
    public static String getTodaysDate(String format){
        return LocalDate.now().format(DateTimeFormatter.ofPattern(format)); // Go to this website for formatting information
        // https://www.journaldev.com/17899/java-simpledateformat-java-date-format
    }

    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end, DateTimeFormatter.ofPattern(format));
        return ChronoUnit.HOURS.between(startTime,endTime);
    }

}

