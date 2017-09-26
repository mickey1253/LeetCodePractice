package code.leet; /**
 * Created by Mickey on 2/25/2016.
 */

import java.text.*;
import java.util.Date;
import java.util.Locale;

public class HelloWorld {



//        public static void main(String[] argv) throws Exception {
//
//            Format formatter = new SimpleDateFormat("dd-MMM-yy");
//            Date date = (Date) formatter.parseObject("29-Jan-02");
//            System.out.println(date);
//        }


//    public static void main(String[] args) {
//        String[] shortMonths = new DateFormatSymbols().getShortMonths();
//        for (int i = 0; i < shortMonths.length; i++) {
//            String shortMonth = shortMonths[i];
//            System.out.println("shortMonth = " + shortMonth);
//        }
//    }
//
//    public static void main(String args[]) {
//        Date date = new Date();
//        DateFormat df;
//
//        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
//        System.out.println("Japan: " + df.format(date));
//
//        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
//        System.out.println("United Kingdom: " + df.format(date));
//
//        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
//        System.out.println("Canada: " + df.format(date));
//    }


    public static void main(String[] args) {
        DateFormat shortDf = DateFormat.getDateInstance(DateFormat.SHORT);

        DateFormat mediumDf = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat longDf = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat fullDf = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(shortDf.format(new Date()));
        System.out.println(mediumDf.format(new Date()));
        System.out.println(longDf.format(new Date()));
        System.out.println(fullDf.format(new Date()));

        // parsing
        try {
            Date date = shortDf.parse("12/12/2006");
        } catch (ParseException e) {
        }
    }

}
