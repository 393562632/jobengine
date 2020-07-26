//package cn.chinatelecom.esurvey;
//
//import cn.chinatelecom.esurvey.comm.DateUtils;
//import cn.chinatelecom.esurvey.comm.LoggerUtils;
//import cn.chinatelecom.esurvey.model.vo.StatisticalInfoVO;
//
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EventLogServiceTest {
//    private static Logger logger = LoggerFactory.getLogger(EventLogServiceTest.class);
//
//    @Autowired
//    private EventLogService eventLogService;
//
//    /**
//     *  测试initEventLogItem
//     */
//    @Test
//    public void initEventLogItemTest() {
//        eventLogService.initEventLogItem(1, 2, "uuid");
//    }
//
//    @Test
//    public void submitEventLogItemTest() {
//        eventLogService.submitEventLogItem(1, 2, "uuid");
//    }
//
//    @Test
//    public void statisticalTest() throws Exception {
//        StatisticalInfoVO statisticalInfoVO = eventLogService.statistical(1, 2);
//        LoggerUtils.info(logger, statisticalInfoVO);
//    }
//
//    @Test
//    public void DateTest() {
//        Date today = new Date();
//        LoggerUtils.info(logger, today);
//        Calendar c = Calendar.getInstance();
//        c.setTime(today);
//        c.add(Calendar.DAY_OF_MONTH, 1);
//        c.set(Calendar.HOUR_OF_DAY, 0);
//        c.set(Calendar.MINUTE, 0);
//        c.set(Calendar.SECOND, 0);
//        c.set(Calendar.MILLISECOND, 0);
//        Date tomorrow = c.getTime();
//        LoggerUtils.info(logger, tomorrow);
//        c.setTime(today);
//        c.add(Calendar.DAY_OF_MONTH, -1);
//        c.set(Calendar.HOUR_OF_DAY, 0);
//        c.set(Calendar.MINUTE, 0);
//        c.set(Calendar.SECOND, 0);
//        c.set(Calendar.MILLISECOND, 0);
//        Date yesterday = c.getTime();
//        LoggerUtils.info(logger, yesterday);
//    }
//
//    @Test
//    public void  midnightTonight() {
//        Calendar calEnd = new GregorianCalendar();
//        calEnd.setTime(new Date());
//        calEnd.set(Calendar.DAY_OF_YEAR, calEnd.get(Calendar.DAY_OF_YEAR)+1);
//        calEnd.set(Calendar.HOUR_OF_DAY, 0);
//        calEnd.set(Calendar.MINUTE, 0);
//        calEnd.set(Calendar.SECOND, 0);
//        calEnd.set(Calendar.MILLISECOND, 0);
//        Date midnightTonight = calEnd.getTime();
//        LoggerUtils.info(logger, midnightTonight);
//    }
//
//    @Test
//    public void DateDateSandBox() {
//        Date date1 = DateUtils.getMidnightTonight();
//        LoggerUtils.info(logger, date1);
//
//        Date date2 = DateUtils.getYestaday(date1);
//        LoggerUtils.info(logger, date2);
//
//        Date date3 = DateUtils.getYestaday(date2);
//        LoggerUtils.info(logger, date3);
//    }
//}
