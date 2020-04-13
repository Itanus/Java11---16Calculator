package Tests.model;

import com.company.model.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest{
    private Operations test = new Operations(null);

    @Test
    void isAddFlag() {
        assertFalse(test.isAddFlag());
        test.changeAddFlag();
        assertTrue(test.isAddFlag());
        test.changeAddFlag();
        assertFalse(test.isAddFlag());
        test.clear();
    }

    @Test
    void isSubFlag() {
        assertFalse(test.isSubFlag());
        test.changeSubFlag();
        assertTrue(test.isSubFlag());
        test.changeSubFlag();
        assertFalse(test.isSubFlag());
        test.clear();
    }

    @Test
    void isDivFlag() {
        assertFalse(test.isDivFlag());
        test.changeDivFlag();
        assertTrue(test.isDivFlag());
        test.changeDivFlag();
        assertFalse(test.isDivFlag());
        test.clear();
    }

    @Test
    void isMulFlag() {
        assertFalse(test.isMulFlag());
        test.changeMulFlag();
        assertTrue(test.isMulFlag());
        test.changeMulFlag();
        assertFalse(test.isMulFlag());
        test.clear();
    }

    @Test
    void makeAddition() {
        test.setLastNumber(10.0);
        test.changeAddFlag();
        assertEquals(26.0, test.makeAddition(16.0));
        test.changeAddFlag();
        assertEquals(Math.PI, test.makeAddition(16.0));
        test.clear();
    }

    @Test
    void makeSubtraction() {
        test.setLastNumber(10.0);
        test.changeSubFlag();
        assertEquals(-6.0, test.makeSubtraction(16.0));
        test.changeSubFlag();
        assertEquals(Math.PI, test.makeSubtraction(16.0));
        test.clear();
    }

    @Test
    void makeMultiplication() {
        test.setLastNumber(10.0);
        test.changeMulFlag();
        assertEquals(160.0, test.makeMultiplication(16.0));
        test.changeMulFlag();
        assertEquals(Math.PI, test.makeMultiplication(16.0));
        test.clear();
    }

    @Test
    void makeDivision() {
        test.setLastNumber(10.0);
        test.changeDivFlag();
        assertEquals(1.0, test.makeDivision(10.0));
        test.changeDivFlag();
        assertEquals(Math.PI, test.makeDivision(0));
        test.clear();

    }

    @Test
    void clear() {
        test.changeDivFlag();
        assertTrue(test.isDivFlag());
        test.setLastNumber(17.0);
        test.clear();
        assertFalse(test.isDivFlag());
        assertEquals(Math.PI,test.makeDivision(9.0));
        test.clear();

    }

    @Test
    void makeEqual() {
        test.setLastNumber(10.0);
        test.changeSubFlag();
        assertEquals(5.0,test.makeEqual(5.0));
        test.clear();
        test.changeAddFlag();
        assertEquals(2.0,test.makeEqual(2.0));
        test.clear();
    }
}