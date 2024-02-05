class ArrayListOfStringTest extends ListOfStringTest {
    @Override
    List<String> makeListOfString() {
        return new ArrayList<String>();
    }
}