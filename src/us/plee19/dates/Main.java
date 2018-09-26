package us.plee19.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Method to illustrate use of dates.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        Date firstDate = new GregorianCalendar(1987, 2, 9).getTime();
        Date secondDate = new GregorianCalendar(1988, 9, 10).getTime();
        Date today = new Date();
        long todayDiff = today.getTime() - firstDate.getTime();
        int daysFromTodayDiff = (int)(todayDiff / (1000 * 60 * 60 * 24));
        System.out.println("Days since Joshua Tree: " + daysFromTodayDiff);
        long dateDiff = secondDate.getTime() - firstDate.getTime();
        int daysDiff = (int)(dateDiff / (1000 * 60 * 60 * 24));
        System.out.println("Days between album releases: " + daysDiff);
        int years = daysFromTodayDiff / 365;
        int dayRemainder = daysFromTodayDiff - (years * 365);
        int months = dayRemainder / 30;
        dayRemainder = dayRemainder - (months * 30);
        System.out.println("Joshua Tree was released " + years + " years, " + months + " months, and " + dayRemainder + " days ago.");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, daysDiff);
        String nextAlbum = sdf.format(c.getTime());
        System.out.println("Today's date is: " + sdf.format(today));
        System.out.println("Next album release is: " + nextAlbum);
    }
}