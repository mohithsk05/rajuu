package org.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd() {
        App app = new App(); // ✅ use App instead of Calculator

        int expectedResult = 4;
        int actualResult = app.add(2, 2);

        assertEquals(expectedResult, actualResult); // ✅ correct import
    }
}