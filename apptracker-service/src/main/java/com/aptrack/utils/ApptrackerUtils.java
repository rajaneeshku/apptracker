package com.aptrack.utils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.FeatureDescriptor;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

/**
 * Created by Murthy on 7/20/2017.
 */
public class ApptrackerUtils {

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
        return Stream.of(wrappedSource.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
                .toArray(String[]::new);
    }

    public static String dbTimestampToString(Timestamp tm) {
        return tm.toLocalDateTime().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
    }

    public static Timestamp stringToDbTimestamp(String dateStr){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        LocalDateTime localDate = LocalDateTime.parse(dateStr, formatter);
        return  Timestamp.valueOf(localDate);

    }

    public static Date stringToDbDate(String dateStr){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        LocalDate localDate = LocalDate.parse(dateStr, formatter);
        return  Date.valueOf(localDate);

    }


    public static String dbDateToString(Date dt) {
        return dt.toLocalDate().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
}
