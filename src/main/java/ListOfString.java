public interface ListOfString {
    /**
     * Gets the number of strings in this list.
     *
     * @return the number of strings in this list.
     */
    int size();

    /**
     * Gets the string at the specified index.
     *
     * @param index the 0-based index
     * @return the string at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    String get(int index);

    /**
     * Adds the given string at the end of this list.
     *
     * @param s the string to add
     */
    public void add(String s);
}