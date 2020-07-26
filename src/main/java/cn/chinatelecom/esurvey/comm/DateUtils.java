package cn.chinatelecom.esurvey.comm;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    // 获取今天午夜时间
    public static Date  getMidnightTonight () {
        Calendar calEnd = new GregorianCalendar();
        calEnd.setTime(new Date());
        calEnd.set(Calendar.DAY_OF_YEAR, calEnd.get(Calendar.DAY_OF_YEAR)+1);
        calEnd.set(Calendar.HOUR_OF_DAY, 0);
        calEnd.set(Calendar.MINUTE, 0);
        calEnd.set(Calendar.SECOND, 0);
        calEnd.set(Calendar.MILLISECOND, 0);
        Date midnightTonight = calEnd.getTime();
        return midnightTonight;
    }

    // 获取前一天时间
    public static Date getYestaday(Date today) {
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DAY_OF_MONTH, -1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        Date yesterday = c.getTime();
        return yesterday;
    }
}
