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
        Date firstDate = new GregorianCalendar(1987, 3, 9).getTime();
        Date secondDate = new GregorianCalendar(1988, 10, 10).getTime();
        Date today = new Date();
        long dateDiff = secondDate.getTime() - firstDate.getTime();
        int daysDiff = (int)(dateDiff / (1000 * 60 * 60 * 24));
        System.out.println("Days between album releases: " + daysDiff);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, daysDiff);
        String nextAlbum = sdf.format(c.getTime());
        System.out.println("Today's date is: " + sdf.format(today));
        System.out.println("Next album release is: " + nextAlbum);
    }
}