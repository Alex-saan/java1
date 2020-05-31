package ru.progwards.java1.lessons.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Insurance {
    public static enum FormatStyle {SHORT, LONG, FULL}

    ;
    private ZonedDateTime start;
    private Duration duration;

    public Insurance(ZonedDateTime start) {
        this.start = start;
    }

    public Insurance(String strStart, FormatStyle style) {
        start = styledStringToZDT(strStart, style);
    }

    private ZonedDateTime styledStringToZDT(String strStart, FormatStyle style) {
        DateTimeFormatter formatter;
        switch (style) {
            case SHORT:
                formatter = DateTimeFormatter.ISO_LOCAL_DATE;
                break;
            case FULL:
                formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
                break;
            case LONG:
                formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                break;
            default:
                formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;

        }
        LocalDate date = LocalDate.parse(strStart, formatter);
        return date.atStartOfDay(ZoneId.systemDefault());
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setDuration(ZonedDateTime stop) {
        duration = Duration.between(start, stop);
    }

    public void setDuration(String strDuration, FormatStyle style) {
        switch (style) {
            case SHORT:
                duration = Duration.ofMillis(Integer.parseInt(strDuration));
                break;
            case LONG:
                LocalDateTime date0 = LocalDateTime.parse("0000-01-01T00:00:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                LocalDateTime date1 = LocalDateTime.parse(strDuration, DateTimeFormatter.ISO_LOCAL_DATE_TIME).plusMonths(1).minusDays(1);
                duration = Duration.between(date0, date1);
                break;
            case FULL:
                duration = Duration.parse(strDuration);
                break;
            default:
                duration = Duration.parse(strDuration);
        }
    }

    public void setDuration(int months, int days, int hours) {
        ZonedDateTime ldt = start == null ? ZonedDateTime.now() : start;
        ldt = ldt.plusMonths(months).plusDays(days).plusHours(hours);
        duration = Duration.between(start, ldt);
    }

    public boolean checkValid(ZonedDateTime dateTime) {
        if (duration == null) return dateTime.isAfter(start);
        ZonedDateTime end = start.plusHours(duration.toHours());
        return dateTime.isAfter(start) && dateTime.isBefore(end);
    }

    @Override
    public String toString() {
        return "Insurance issued on " + start + " is " + (checkValid(ZonedDateTime.now()) ? "" : "not ") + "valid";
    }

}