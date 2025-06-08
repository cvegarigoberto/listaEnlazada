import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTest {
    private CustomLinkedList list;

    @BeforeEach
    void setUp() {
        list = new CustomLinkedList();
    }

    @Test
    void testInsert() {
        list.insert(10);
        assertEquals(10, list.getHead().getData(), "El primer elemento debería ser 10");

        list.insert(20);
        assertEquals(20, list.getHead().getData(), "El primer elemento debería ser 20 después de la inserción");
    }

    @Test
    void testDelete() {
        list.insert(10);
        list.insert(20);
        list.delete();
        assertEquals(10, list.getHead().getData(), "Después de eliminar, el primer elemento debería ser 10");
    }

    @Test
    void testInsertAtPosition() {
        list.insert(10);
        list.insert(30);
        list.insert(20, 2); // Insertamos 20 en la segunda posición
        assertEquals(20, list.get(2).getData(), "El segundo elemento debería ser 20");
    }

    @Test
    void testSearchFirstInstance() {
        list.insert(10);
        list.insert(20);
        list.insert(30);
        assertEquals(2, list.searchFirstInstance(20), "El elemento 20 debería estar en la posición 2");
        assertEquals(0, list.searchFirstInstance(40), "El elemento 40 no debería existir en la lista");
    }

    @Test
    void testSize() {
        assertEquals(0, list.size(), "La lista debería estar vacía inicialmente");
        list.insert(10);
        list.insert(20);
        assertEquals(2, list.size(), "La lista debería contener 2 elementos");
    }


}
