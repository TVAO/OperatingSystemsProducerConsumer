import interfaces.IBuffer;
import utilities.BufferItem;
import utilities.Sleep;
/**
 * This class represents the Consumer process that share a common fixed-size buffer (i.e. Buffer) with the Producer process.
 * The consumer is used to consume data (i.e. removing item from the buffer) one piece at a time.
 * Semaphores are used to communicate with the Producer process and notify when an item has been removed.
 */
public class Consumer implements Runnable {

    private final IBuffer buffer;

    public Consumer(IBuffer buffer)
    {
        this.buffer = buffer;
    }

    /**
     * The run method is called in a separate execution thread.
     * The consumer will switch between sleeping for a random period of time
     * and attempting to remove an item from the buffer.
     */
    public void run()
    {
        while (true)
        {
                // Sleep for a random period of time
                Sleep.sleep("Consumer Thread: " + Thread.currentThread().getId());

                // Consume item from buffer
                System.out.println("Consumer Thread: " + Thread.currentThread().getId() + " is consuming");


                //Keep trying to consume until buffer is available
                Integer itemToRemove = null;
                BufferItem item;
                boolean isWaiting = false;
                boolean isPosted = false;

            //Do while loop to keep consuming if buffer is unavailable
            do
                {
                    item = buffer.remove_item();
                    if (item != null) // If no item let Producer produce
                        itemToRemove = (Integer) item.getItem();

                    if(isWaiting && !isPosted)
                    {
                        System.out.println("Buffer unavailable -- Consumer Thread: " + Thread.currentThread().getId() + " is waiting...");
                        isPosted = true; // Avoid print spam
                    }
                    isWaiting = true;
                }
                while(item == null); // Continuously try removing until success in do loop

                //Print consumed item.
                printProcessAndItem(itemToRemove, Thread.currentThread().getId());
        }
    }

    private void printProcessAndItem(int item, long threadId)
    {
        System.out.println("Process ID: " + threadId + " consumed item: " + item);
    }
}

