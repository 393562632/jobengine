package cn.chinatelecom.esurvey.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;

public class DataxJob implements Runnable {

    private final static Logger logger = LoggerFactory.getLogger(DataxJob.class);

    Long frequency;


    String filePath;

    String jsonPath;

    Boolean state;

    int id;

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        while(state) {

            System.out.println("I am  run " );
            String[] arguments = new String[] {"python",filePath+"datax.py ",jsonPath+String.valueOf(id)+".json"};
            try {
                Process process = Runtime.getRuntime().exec(arguments);
                BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
                String line = null;
                while ((line = in.readLine()) != null) {
                    logger.info("line:"+line);
                }
                in.close();
                //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
                //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
                int re = process.waitFor();
                logger.info("re:"+re);
                Thread.sleep(frequency * 1000);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void stop() {
        state = false;
    }


    /**
     *
     * @param frequency
     * @param state
     */
    public DataxJob(Long frequency, Boolean state,String filePath,int id,String jsonPath) {
        this.frequency = frequency;
        this.state = state;
        this.filePath=filePath;
        this.id=id;
        this.jsonPath=jsonPath;

    }
}
