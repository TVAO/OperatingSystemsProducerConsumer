package utilities;

/**
 * Wrapper class for items inserted and removed in the buffer.
 */
public class BufferItem {

    private final Object item;

    // Initialize fields
    public BufferItem(Object item)
    {
        this.item = item;
    }

    /**
     * Returns item.
     * Note that item may be Null.
     * @return item.
     */
    public Object getItem()
    {
        return item;
    }
}
