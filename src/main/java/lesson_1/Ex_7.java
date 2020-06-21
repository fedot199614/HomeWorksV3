package lesson_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_7 {
    public static Date parseDate(String dateStr) throws ParseException {

        return new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
    }

    public static String dateToString(Date date){
        String strDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
        return strDate;
    }

}
