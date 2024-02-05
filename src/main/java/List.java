public interface List<T> {
    /**
     * Gets the number of items in this list.
     *
     * @return the number of items in this list.
     */
    int size();

    /**
     * Gets the item at the specified index.
     *
     * @param index the 0-based index
     * @return the string at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    T get(int index);

    /**
     * Adds the given item at the end of this list.
     *
     * @param s the item to add
     */
    public void add(T s);
}