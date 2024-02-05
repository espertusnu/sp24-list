import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class ListOfStringTest {
    List<String> emptyList;
    List<String> listABC;

    abstract List<String> makeListOfString();

    @BeforeEach
    public void setup() {
        emptyList = makeListOfString();
        listABC = makeListOfString();
        listABC.add("A");
        listABC.add("B");
        listABC.add("C");
    }

    int getHealth() {
        return 0;
    }

    @Test
    public void sizeOnEmptyList() {
        assertEquals(0, emptyList.size());
    }

    @Test
    public void sizeOnNonEmptyList() {
        assertEquals(3, listABC.size());
    }

    @Test
    public void getOnEmptyListThrowsException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> emptyList.get(0));
    }

    @Test
    public void getInRangeWorks() {
        assertEquals("A", listABC.get(0));
        assertEquals("B", listABC.get(1));
        assertEquals("C", listABC.get(2));
    }

    @Test
    public void getNegativeThrowsException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> listABC.get(-1));
    }

    @Test
    public void getOutOfRangeThrowsException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> listABC.get(3));
    }

    @Test
    public void addToEmptyListWorks() {
        emptyList.add("zero");
        assertEquals(1, emptyList.size());
        assertEquals("zero", emptyList.get(0));
    }

    @Test
    public void addToNonEmptyListWorks() {
        listABC.add("D");
        assertEquals(4, listABC.size());
        assertEquals("A", listABC.get(0));
        assertEquals("B", listABC.get(1));
        assertEquals("C", listABC.get(2));
        assertEquals("D", listABC.get(3));
    }
}