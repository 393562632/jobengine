package cn.chinatelecom.esurvey.jobs;

public class DataxJob implements Runnable {

    int frequency;

    Boolean state;

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
            try {
                Thread.sleep(frequency * 1000);
            } catch (InterruptedException e) {
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
    public DataxJob(int frequency, Boolean state) {
        this.frequency = frequency;
        this.state = state;
    }
}
