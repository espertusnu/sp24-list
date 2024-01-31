public class ArrayListOfString implements ListOfString {
    // If this constant is changed, also change the constructor javadoc.
    private static final int INITIAL_CAPACITY = 10;

    // The number of strings in the array, not the size of the array
    protected int size;

    private String[] array;

    private int getCapacity() {
        return array.length;
    }

    /**
     * Creates an empty array list.
     */
    public ArrayListOfString() {
        this(INITIAL_CAPACITY);
    }

    /**
     * Creates an empty array list with the specified initial capacity.
     * Providing a capacity improves efficiency by avoiding unnecessary work
     * as elements are added.
     *
     * @param initialCapacity the initial capacity of the array
     */
    public ArrayListOfString(int initialCapacity) {
        array = new String[initialCapacity];
        size = 0;
    }

    /**
     * Gets the number of strings in this list.
     *
     * @return the number of strings in this list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Gets the string at the specified index.
     *
     * @param index the 0-based index
     * @return the string at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for list of size %d",
                            index, size()));
        }
        return array[index];
    }

    // Increases the capacity of this list, if necessary, to hold at least the
    // number of elements specified by the minimum capacity argument.
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > getCapacity()) {
            // Allocate a bigger array.
            String[] newArray = new String[minCapacity];

            // Copy all elements of the old array into the new array.
            System.arraycopy(array, 0, newArray, 0, array.length);

            // Make the instance variable point to the new array.
            array = newArray;
        }
    }

    private boolean isFull() {
        return size == getCapacity();
    }

    private void doubleCapacity() {
        ensureCapacity(2 * getCapacity());
    }

    /**
     * Adds the given string at the end of this list.
     *
     * @param s the string to add
     */
    @Override
    public void add(String s) {
        if (isFull()) {
            doubleCapacity();
        }
        array[size++] = s;
    }
}