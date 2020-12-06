package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {

    @Test
    void sum() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void multiply() {
        assertEquals(9, 3 * 3);
    }
}
