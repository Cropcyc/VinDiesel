package com.jaguar.landrover;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LandroverApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void testCheckValidityValid() {
        assertTrue(Vin.checkValidity("0471958692"));
        assertTrue(Vin.checkValidity("0471606958"));
    }

    @Test
    public void testCheckValidityInvalid() {
        assertFalse(Vin.checkValidity("0471958690"));
        assertFalse(Vin.checkValidity("0471606957"));
    }

    @Test
    public void testWithDash() {
        assertEquals("047195869-2", Vin.withDash("0471958692"));
        assertEquals("047160695-8", Vin.withDash("0471606958"));
    }
}
