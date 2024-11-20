package umons.ac.be;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
class AdditionTest {
    @Test
    public void addEquals() {
        System.out.println("Test addEquals");
        assertEquals(8,Addition.add(5, 3));
    }

    @Test
    public void addNotEquals() {
        System.out.println("Test addNotEquals");
        assertNotEquals(3, Addition.add(1, 1));
    }
}