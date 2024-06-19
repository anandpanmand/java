package practice;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDate {
    public static void main(String[] args) {
        int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();
        int day,mont,year;
        day=date.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
