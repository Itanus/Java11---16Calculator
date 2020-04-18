package Tests.controller;

import com.company.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private Controller controller = new Controller();

    @Test
    void testIsAddFlag() {
        controller.changeAddFlag();
        assertTrue(controller.isAddFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.changeAddFlag();
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.changeAddFlag();
        assertTrue(controller.isAddFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.clear();
    }

    @Test
    void testIsSubFlag() {
        controller.changeSubFlag();
        assertTrue(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.changeSubFlag();
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.changeSubFlag();
        assertTrue(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isMulFlag());

        controller.clear();
    }

    @Test
    void testIsDivFlag() {
        controller.changeDivFlag();
        assertTrue(controller.isDivFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isMulFlag());

        controller.changeDivFlag();
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isMulFlag());

        controller.changeDivFlag();
        assertTrue(controller.isDivFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isMulFlag());

        controller.clear();
    }

    @Test
    void testIsMulFlag() {
        controller.changeMulFlag();
        assertTrue(controller.isMulFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isAddFlag());

        controller.changeMulFlag();
        assertFalse(controller.isMulFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isAddFlag());

        controller.changeMulFlag();
        assertTrue(controller.isMulFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isDivFlag());
        assertFalse(controller.isAddFlag());

        controller.clear();
    }

    @Test
    void testMakeEqual() {
        controller.setLastNumber(12);
        controller.changeAddFlag();
        assertEquals(14, controller.makeEqual(2));
        assertEquals(20, controller.makeEqual(8));
        assertEquals(12, controller.makeEqual(0));
        assertEquals(-1, controller.makeEqual(-13));

        controller.clear();

        controller.changeSubFlag();
        assertEquals(-2, controller.makeEqual(2));
        assertEquals(0, controller.makeEqual(0));

        controller.clear();

        controller.setLastNumber(15);
        controller.changeDivFlag();
        assertEquals(Math.PI, controller.makeEqual(0));
        assertEquals(3, controller.makeEqual(5));

        controller.clear();
    }

    @Test
    void testClear() {
        controller.changeDivFlag();
        controller.setLastNumber(2);
        assertTrue(controller.isDivFlag());
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isMulFlag());

        controller.clear();
        assertFalse(controller.isSubFlag());
        assertFalse(controller.isAddFlag());
        assertFalse(controller.isMulFlag());
        assertFalse(controller.isDivFlag());

        controller.changeAddFlag();
        assertEquals(2, controller.makeEqual(2));

        controller.clear();
    }

    @Test
    void testConvertToHex() {
        assertEquals("A", controller.convertToHex(10.0));
        assertEquals("A2", controller.convertToHex(162.0));
        assertEquals("0", controller.convertToHex(0.0));
        assertEquals("AA", controller.convertToHex(170.0));
        assertEquals("5", controller.convertToHex(5.0));
        assertEquals("11", controller.convertToHex(17.0));
    }

    @Test
    void testConvertToDec() {
        assertEquals(10.0, controller.convertToDec("A"));
        assertEquals(162.0, controller.convertToDec("A2"));
        assertEquals(0.0, controller.convertToDec("0"));
        assertEquals(170.0, controller.convertToDec("AA"));
        assertEquals(5.0, controller.convertToDec("5"));
        assertEquals(17.0, controller.convertToDec("11"));
    }
}