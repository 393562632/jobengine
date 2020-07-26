package cn.chinatelecom.esurvey.jobs;

import org.apache.ibatis.ognl.IntHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Container {

    public static Map<Integer, DataxJob> contain = new ConcurrentHashMap<>();


    public static void start(DataxJob dataxJob, Integer jobId) {
        Thread thread = new Thread(dataxJob);
        thread.start();
        contain.put(jobId, dataxJob);
    }

    public static void stop(Integer jobId) {
        DataxJob dataxJob = contain.get(jobId);
        dataxJob.stop();
        contain.remove(jobId);
    }
}
