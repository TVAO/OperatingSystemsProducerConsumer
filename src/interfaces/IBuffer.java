package interfaces;

import utilities.BufferItem;

/**
 * This is an interface for the Buffer class used to outline the methods that it should implement.
 */
public interface IBuffer {

    /**
     * Insert an item into the Buffer.
     * NB: this may be either a blocking or non-blocking operation.
     */
    int insert_item(BufferItem item);

    /**
     * Remove an item from the Buffer.
     * NB: this may be either a blocking or non-blocking operation.
     */
    BufferItem remove_item();

}
