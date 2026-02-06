package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {

    @Test
    void testEqualsSameObjects() {
        Furniture f1 = new Furniture("Стіл", "Дуб", 2500.0, 15, "Коричневий");
        Furniture f2 = new Furniture("Стіл", "Дуб", 2500.0, 15, "Коричневий");

        assertEquals(f1, f2);
    }

    @Test
    void testEqualsDifferentPrice() {
        Furniture f1 = new Furniture("Стіл", "Дуб", 2500.0, 15, "Коричневий");
        Furniture f2 = new Furniture("Стіл", "Дуб", 3000.0, 15, "Коричневий");

        assertNotEquals(f1, f2);
    }
}

