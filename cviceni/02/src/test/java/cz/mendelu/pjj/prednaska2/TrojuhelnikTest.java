package cz.mendelu.pjj.prednaska2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrojuhelnikTest {
    double delta = 0.000001;

    @Before
    public void setUp() throws Exception {
        Trojuhelnik.resetPocetTrojuhelniku();
    }

    @Test
    public void getStranaA() {
        assertEquals(5, new Trojuhelnik(5, 6, 7).getStranaA(), delta);
        assertEquals(1, new Trojuhelnik().getStranaA(), delta);
    }

    @Test
    public void getStranaB() {
        assertEquals(6, new Trojuhelnik(5, 6, 7).getStranaB(), delta);
        assertEquals(1, new Trojuhelnik().getStranaB(), delta);
    }

    @Test
    public void getStranaC() {
        assertEquals(7, new Trojuhelnik(5, 6, 7).getStranaC(), delta);
        assertEquals(1, new Trojuhelnik().getStranaC(), delta);
    }

    @Test
    public void getPocetTrojuhelniku() {
        assertEquals(0, Trojuhelnik.getPocetTrojuhelniku());
        new Trojuhelnik();
        assertEquals(1, Trojuhelnik.getPocetTrojuhelniku());
        new Trojuhelnik(5, 6, 7);
        assertEquals(2, Trojuhelnik.getPocetTrojuhelniku());
        new Trojuhelnik(5, 6, 7);
    }

    @Test
    public void testToString() {
        Trojuhelnik t = new Trojuhelnik();
        String result = t.toString();
        String expResult = "Trojuhelnik{stranaA=1.0, stranaB=1.0, stranaC=1.0}";
        assertEquals(expResult, result);

        t = new Trojuhelnik(2.5, 3.2, 4.4);
        result = t.toString();
        expResult = "Trojuhelnik{stranaA=2.5, stranaB=3.2, stranaC=4.4}";
        assertEquals(expResult, result);
    }
}