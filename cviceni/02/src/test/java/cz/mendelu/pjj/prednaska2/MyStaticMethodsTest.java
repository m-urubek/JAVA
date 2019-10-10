package cz.mendelu.pjj.prednaska2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStaticMethodsTest {

    @Test
    public void jeDelitelne() {
        assertTrue(MyStaticMethods.jeDelitelne(77, 11));
        assertTrue(MyStaticMethods.jeDelitelne(-39, 13));
        assertTrue(MyStaticMethods.jeDelitelne(-9, -3));
        assertTrue(MyStaticMethods.jeDelitelne(-16, 4));
        assertTrue(MyStaticMethods.jeDelitelne(0, 5));
        assertFalse(MyStaticMethods.jeDelitelne(5, 0));
        assertFalse(MyStaticMethods.jeDelitelne(5, 2));
    }

    @Test
    public void preponaPravouhleho() {
        assertEquals(MyStaticMethods.preponaPravouhleho(3.0, 4.0), 5.0, 0.000001);
        assertEquals(MyStaticMethods.preponaPravouhleho(3.123456, 2.987654), 4.322274, 0.000001);
        assertEquals(MyStaticMethods.preponaPravouhleho(-3.0, 4.0), -1.0, 0.000001);
        assertEquals(MyStaticMethods.preponaPravouhleho(3.0, -4.0), -1.0, 0.000001);
        assertEquals(MyStaticMethods.preponaPravouhleho(-3.14, -3.14), -1.0, 0.000001);
    }

    @Test
    public void minAMax() {
        int[] pole = {5, 3, 8, -2, 11, 4};
        int[] expResult = {-2, 11};
        int[] result = MyStaticMethods.minAMax(pole);
        assertArrayEquals(expResult, result);

        pole = new int[] {-5, -3, -8, -2, -11, -4};
        expResult = new int[] {-11, -2};
        result = MyStaticMethods.minAMax(pole);
        assertArrayEquals(expResult, result);

        pole = new int[] {6};
        expResult = new int[] {6, 6};
        result = MyStaticMethods.minAMax(pole);
        assertArrayEquals(expResult, result);

        pole = new int[] {};
        result = MyStaticMethods.minAMax(pole);
        assertNull(result);

        result = MyStaticMethods.minAMax(null);
        assertNull(result);
    }

    @Test
    public void jeRcDelitelne11() {
        assertTrue(MyStaticMethods.jeRcDelitelne11("   1302071309  "));
        assertTrue(MyStaticMethods.jeRcDelitelne11(" 8158014755 "));
        assertTrue(MyStaticMethods.jeRcDelitelne11(" 465801127   "));
        assertFalse(MyStaticMethods.jeRcDelitelne11(" 8158014754 "));
        assertFalse(MyStaticMethods.jeRcDelitelne11("   465801128 "));
        assertFalse(MyStaticMethods.jeRcDelitelne11(" 276617  "));
        assertFalse(MyStaticMethods.jeRcDelitelne11(" 92677055273    "));
        assertFalse(MyStaticMethods.jeRcDelitelne11(null));
    }

    @Test
    public void objectToString() {
        assertEquals("Java", MyStaticMethods.objectToString((Object) "Java"));
        assertEquals("", MyStaticMethods.objectToString((Object) ""));
        assertNull(MyStaticMethods.objectToString(new Object()));
        assertNull(MyStaticMethods.objectToString(3.14));
        assertNull(MyStaticMethods.objectToString(null));
    }

    @Test
    public void stringToObject() {
        assertEquals((Object) "Java", MyStaticMethods.objectToString("Java"));
        assertEquals(null, MyStaticMethods.objectToString(null));
    }

    @Test
    public void bodyNaZnamku() {
        assertEquals('A', MyStaticMethods.bodyNaZnamku(100));
        assertEquals('A', MyStaticMethods.bodyNaZnamku(90));
        assertEquals('B', MyStaticMethods.bodyNaZnamku(89));
        assertEquals('B', MyStaticMethods.bodyNaZnamku(80));
        assertEquals('C', MyStaticMethods.bodyNaZnamku(79));
        assertEquals('C', MyStaticMethods.bodyNaZnamku(70));
        assertEquals('D', MyStaticMethods.bodyNaZnamku(69));
        assertEquals('D', MyStaticMethods.bodyNaZnamku(60));
        assertEquals('E', MyStaticMethods.bodyNaZnamku(59));
        assertEquals('E', MyStaticMethods.bodyNaZnamku(50));
        assertEquals('F', MyStaticMethods.bodyNaZnamku(49));
        assertEquals('F', MyStaticMethods.bodyNaZnamku(0));
        assertEquals('F', MyStaticMethods.bodyNaZnamku(-3));
    }
}