import interfaces.IBuffer;
import utilities.BufferItem;
import utilities.Sleep;

import java.util.Random;

/**
 * This class represents the Producer process that share a common fixed-size buffer (i.e. Buffer) with the Consumer process.
 * The producer is used to generate data, put it into the buffer and start again.
 * Semaphores are used to communicate with the Consumer process and notify when an item has been inserted.
 */
public class Producer implements Runnable {

    private final IBuffer buffer;
    //private Object itemToProduce;

    public Producer(IBuffer buffer) {
        this.buffer = buffer;

    }

    /**
     * The run method is called in a separate execution thread.
     * The producer will switch between sleeping for a random period of time
     * and inserting random integers into the buffer.
     */
    public void run()
    {
        Random r = new Random();

        while (true)
        {
                // Sleep for a random period of time
                Sleep.sleep("Producer " + Thread.currentThread().getId());

                // Produce item and enter into buffer
                BufferItem item = new BufferItem(r.nextInt(Integer.MAX_VALUE));

            // Enqueue item, Print process id and random integer item value
            //While buffer is unavailable eg: if full or mutex is unavailable keep trying until item enqueued.
            int statusCode;
            boolean isWaiting = false;
            boolean isPosted = false;

            // Do while loop to keep producing if buffer is unavailable
            do
            {
                statusCode = buffer.insert_item(item);
                if(isWaiting && !isPosted)
                {
                    System.out.println("Buffer unavailable -- Producer Thread: " + Thread.currentThread().getId() + " is waiting.");
                    isPosted = true; // Avoid print spam
                }
                isWaiting = true;
            }
            while(statusCode == -1); // Continuously try inserting until success in do loop

            printProcessAndItem((Integer)item.getItem(), Thread.currentThread().getId());

        }


    }



    private void printProcessAndItem(int item, long threadId)
    {
        System.out.println("Process ID: " + threadId + " Produced item: " + item);
    }


}