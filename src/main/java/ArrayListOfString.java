public class ArrayListOfString implements ListOfString {
    // If this constant is changed, also change the constructor javadoc.
    private static final int INITIAL_CAPACITY = 10;

    // The number of strings in the array, not the size of the array
    private int size;

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
        return 0; // TODO: Implement
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
        return null; // TODO: Implement
    }

    // Increases the capacity of this list, if necessary, to hold at least the
    // number of elements specified by the minimum capacity argument.
    private void ensureCapacity(int minCapacity) {
    }

    /**
     * Adds the given string at the end of this list.
     *
     * @param s the string to add
     */
    @Override
    public void add(String s) {
        // TODO: Implement
    }
}