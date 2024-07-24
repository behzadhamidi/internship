package javadate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("before formatting :"+now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);


        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime,formatter );
        System.out.println("Parsed date and time: " + parsedDateTime);
    }
}

