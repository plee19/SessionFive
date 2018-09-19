package us.plee19.dates;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Date firstDate = new GregorianCalendar(1987, 3, 9).getTime();
        Date secondDate = new GregorianCalendar(1988, 10, 10).getTime();
        long dateDiff = secondDate.getTime() - firstDate.getTime();
        long daysDiff = dateDiff / (1000 * 60 * 60 * 24);

    }
}