package ru.progwards.alex;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates {
    public Date createDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1986, 1, 28, 0, 0, 0);
        return calendar.getTime();
    }

    public Instant createInstant() {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2020, 01, 01, 15, 00, 00, 00, ZoneId.of("Europe/Moscow"));
        return Instant.ofEpochSecond((zonedDateTime.toEpochSecond())).plusNanos(1);
    }

    public ZonedDateTime parseZDT(String str) {
        Locale l = Locale.forLanguageTag("EN");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS Z zzzz", l);
        return ZonedDateTime.from(dateTimeFormatter.parse(str));
    }

//            "dd.MM.yyyy HH:mm:ss.S"
//                    "'От''езд' - EEEE dd MMMM 'в' ha"
//                 "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'"


    public static void main(String[] args) {
        Dates dates = new Dates();
        //System.out.println(dates.parseZDT("01.01.2020 16:27:14.444 +0300 Moscow Standard Time"));
        //Dates dates = new Dates();
        //System.out.println(dates.createDate());
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt1.plusDays(4);
        Duration duration = Duration.between(ldt1, ldt2);
        System.out.println(duration.toHours());
        LocalDateTime ldt3 = LocalDateTime.of(2019, 05, 05, 22, 24);
        //System.out.println(ldt3);
        ZoneId zid1 = ZoneId.of("Europe/Moscow");
        //System.out.println(zid1.getRules().getOffset(Instant.now()));
        //System.out.println(Instant.now());
        //Date date=new Date();
        //System.out.println(date);
        //System.out.println(dates.createInstant());
    }
}
