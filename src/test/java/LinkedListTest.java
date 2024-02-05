class LinkedListTest extends ListOfStringTest {
    @Override
    ListOfString makeListOfString() {
        return new LinkedList();
    }
}