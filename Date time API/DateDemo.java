import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("returns the time since 1st jan 1970: " + d.getTime());
        d.setTime(21);
        System.out.println("setTime(time) returns the time in millisec after jan1970: " + d);
        d.setMonth(11);// just for learning I used deprecated methods
        LocalDate dt = LocalDate.now(); // since the value returned by now() is an object of type LocalDate class
        // so we created an instance of LocalDate to store that value this instance will
        // point to that value
        System.out.println(dt);
        LocalDate dt1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));// getting date using the zone ID
        System.out.println(dt1);
        // if I want someother date except today's date
        dt1 = LocalDate.of(2020, Month.MARCH, 10);
        System.out.println("the date for that specified Y/M/D is:- " + dt1);
        dt1 = LocalDate.ofEpochDay(1000);
        System.out.println("1000 days after the epoch day is:- " + dt1);
        dt1 = LocalDate.parse("2020-02-10");
        System.out.println(dt1);
        LocalDate dt2 = dt1.plusMonths(6);// returns a new object of type LocalObject with the modified month
        System.out.println(dt2);
        System.out.println("date 1 is after date 2 " + dt1.isAfter(dt2)); // isAfter() returns true/false
        LocalTime lt = LocalTime.now();
        System.out.println("the local time is:- " + lt);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("the zoned date time is:- " + zdt);
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println("the offset date time no zone info" + odt);
        zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        MonthDay md = MonthDay.now();
        System.out.println("month day info " + md);
        Period p = Period.of(2, 2, 12);
        System.out.println(p.addTo(LocalDate.now()));// adding period of 2y2m12days to the localdatetime
        Instant i = Instant.now();
        System.out.println(i);// with respect to greenwich mean time
        LocalDateTime L = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("the format is date/month/year " + df.format(L));// passing the local date time object to the
                                                                            // format methodwhich contains the pattern
                                                                            // dd/MM/yyyy

    }
}
