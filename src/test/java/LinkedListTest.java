class LinkedListTest extends ListOfStringTest {
    @Override
    List<String> makeListOfString() {
        return new LinkedList<String>();
    }
}