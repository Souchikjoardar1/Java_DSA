import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("returns the time since 1st jan 1970: " + d.getTime());
        d.setTime(21);
        System.out.println("setTime(time) returns the time in millisec after jan 1970: " + d);
        d.setMonth(11);
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
    }
}
