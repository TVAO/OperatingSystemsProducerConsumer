package utilities;

import java.util.Random;

/**
 * Helper class used to make the current thread sleep.
 * Note that interrupted exceptions are not currently handled (i.e. when current thread is interrupted).
 */
 public class Sleep {

    private static final int MAX_SLEEP_TIME = 5; // Max sleep time in seconds

    /**
     * Sleep between zero and MAX_SLEEP_TIME seconds.
     */
    public static void sleep(String tag) {
        Random r = new Random();
        sleep(r.nextInt(MAX_SLEEP_TIME), tag);
    }

    /**
     * Nap between zero and duration seconds.
     */
    public static void sleep(int duration, String tag)
    {
        System.out.println(tag + " : Sleep for " + duration + " seconds");
        // Sleep the currently executing thread (cease execution) for specified number of ms
        // NB: subject to accuracy of system timers/schedulers
        try { Thread.sleep(duration * 1000); }
        catch (InterruptedException e) {
            // sleep() method throws InterruptedException - if any thread has interrupted the current thread.
            System.out.println("Current thread was interrupted in sleep(): " + e);
            System.out.println("The thread with process id: " + Thread.currentThread().getId() + " was interrupted." + "\n" + e);

        }
    }

}
