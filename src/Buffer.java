import interfaces.IBuffer;
import interfaces.IQueue;
import utilities.BufferItem;

import java.util.concurrent.Semaphore;

/**
 * This program implements the bounded buffer with semaphores and a mutex lock.
 */
public class Buffer implements IBuffer {

    private final Semaphore empty, full, mutex;
    private final IQueue bufferQueue;

    // More private fields such as a container object for holding the buffer items

    // Initialize semaphores
    public Buffer(IQueue bufferQueue)
    {
        this.bufferQueue = bufferQueue;
        empty = new Semaphore(Constants.BUFFER_SIZE_5);
        full = new Semaphore(0);
        mutex = new Semaphore(1);
    }

    /**
     * Inserts item if there is a mutex available and if the buffer is not full.
     * @param item to add.
     * @return return code, 1 if success or -1 if error.
     * @throws InterruptedException if thread is interrupted.
     */
    public synchronized int insert_item(BufferItem item)
    {
        try
        {
            // Check if permits not available
            if((mutex.availablePermits() == 0) || (empty.availablePermits() == 0) ) { return -1; }

            // Acquire semaphores
            mutex.acquire();
            empty.acquire(); // keep track of number of empty elements (total--)
            // Provides synchronization for producer
            // Stops producers from running when buffer is full

            // Insert item in critical section
            bufferQueue.enqueue(item);
            full.release(); // keep track of number of elements (total ++)
            // Wake up Consumer if buffer was empty

            return 1;
        }
        catch (InterruptedException e) { return -1; }
        catch (ArrayStoreException e) { return -1; }
        finally
        {
            //Release mutex lock
            mutex.release();

        }
    }

    /**
     * Removes item if there is a mutex available and the buffer is not empty.
     * @return the item removed.
     */
    public synchronized BufferItem remove_item()
    {
        try
        {
            // Check if permits are available
            if((mutex.availablePermits() == 0) || (full.availablePermits() == 0) ) { return null; }

            // Acquire semaphores
            full.acquire(); // keep track of number of elements (total--)
            // Provides synchronization for consumer by stopping it when buffer is empty

            mutex.acquire(); // mutual exclusion lock
            empty.release(); // keep track of number of empty elements (total++)
            // If buffer was full, Producer wakes up and returns item

            // Retrieve item from critical section

            return (BufferItem) bufferQueue.dequeue();

        }
        catch (InterruptedException e) { return null; } // Thread.currentThread().interrupt();
        catch (ArrayStoreException e) { return null; } //
        finally
        {
            // Release semaphores
            mutex.release();

        }

    }

}
