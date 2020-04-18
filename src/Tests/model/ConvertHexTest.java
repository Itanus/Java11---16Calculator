package Tests.model;

import com.company.model.ConvertHex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertHexTest {
    private ConvertHex testClass = new ConvertHex();

    @Test
    void toNumber() {
        assertEquals(10.0, testClass.toDec("A"));
        assertEquals(162.0, testClass.toDec("A2"));
        assertEquals(0.0, testClass.toDec("0"));
        assertEquals(170.0, testClass.toDec("AA"));
        assertEquals(5.0, testClass.toDec("5"));
        assertEquals(17.0, testClass.toDec("11"));
    }

    @Test
    void toHex() {
        assertEquals("A", testClass.toHex(10.0));
        assertEquals("A2", testClass.toHex(162.0));
        assertEquals("0", testClass.toHex(0.0));
        assertEquals("AA", testClass.toHex(170.0));
        assertEquals("5", testClass.toHex(5.0));
        assertEquals("11", testClass.toHex(17.0));
    }
}