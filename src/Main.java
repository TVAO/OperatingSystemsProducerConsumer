import interfaces.IBuffer;
import utilities.CircularQueue;
import utilities.Sleep;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to encapsulate the creation of the buffer and producer and consumer threads.
 * The main() function initializes the buffer and create the separate producer and consumer threads.
 * Once it has created the producer and consumer threads,
 * the main () function will sleep for a period of time and, upon awakening, will terminate the application.
 */
public class Main {

    /**
     * Creates the buffer and the producer/consumer threads based on input parameters
     * @param args 0 (how long to sleep before terminating), 1 (number of producer threads) and 2 (number of consumer threads)
     */
    public static void main(String[] args)
    {

        if(args.length != 3)
        {
            System.out.println("\nInvalid arguments. \nPlease enter sleepinterval, producer amount and consumer amount.\nEg: java Main 10 1 1\nExiting...");
            System.exit(1);

        }

        try
            {
            List<Thread> producers = new ArrayList<>();
            List<Thread> consumers = new ArrayList<>();


            /* 1. Get command line arguments argv[1], argv[2], argv[3]*/
            int sleepInterval =  Integer.parseInt(args[0]);
            int producerAmount = Integer.parseInt(args[1]);
            int consumerAmount = Integer.parseInt(args[2]);

            /* 2. Initialize buffer */
            IBuffer sharedBuffer = new Buffer(new CircularQueue(Constants.BUFFER_SIZE_10));

            /* 3. Create producer threads --- */
            for (int i = 0; i < producerAmount; i++)
            {

                Thread pThread = new Thread(new Producer(sharedBuffer));
                pThread.start(); //use start to call run method in separate thread
                producers.add(pThread);
            }

            /* 4. Create consumer threads ---*/
            for (int i = 0; i < consumerAmount; i++)
            {
                Thread cThread = new Thread(new Consumer(sharedBuffer));
                cThread.start(); //use start to call run method in separate thread
                consumers.add(cThread);
            }

            /* 5. Sleep */
            Sleep.sleep(sleepInterval,"Main thread ");

            /* 6. Exit */
            System.exit(1); //Set argument to 0 to exit -- 1 is for testing.
        }
        catch(NumberFormatException e)
        {
            System.out.println("\nInvalid arguments. \nPlease enter sleepinterval, producer amount and consumer amount.\nEg: java Main 10 1 1\nExiting...");
            System.exit(1);
        }
    }


}
