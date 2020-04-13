package edu.berkeley.aep;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class CityTest {

    City a = new City();
    City b = new City();
    City c = new City();
    City d = new City();
    City e = new City();
    City f = new City();
    City g = new City();
    City h = new City();

    public CityTest() {
        a.addChild(f);
        b.addChild(c);
        b.addChild(a);
        c.addChild(d);
        c.addChild(e);
        d.addChild(e);
        e.addChild(b);
        h.addChild(b);
    }

    @Test
    public void cityShouldBeAbleToReachItself() {
        var city = new City();
        assertTrue(city.canReach(city));
    }

    @Test
    public void cityNotShouldBeAbleToReachDisconnectedCity() {
        var city = new City();
        assertFalse(city.canReach(new City()));
    }

    @Test
    public void hShouldBeAbleToReachB() {
        assertTrue(h.canReach(b));
    }

    @Test
    public void hShouldNotBeAbleToReachG() {
        assertFalse(h.canReach(g));
    }

    @Test
    public void hopsFromHToHShouldBeZero() {
        assertEquals(0, h.hopsTo(h));
    }

    @Test
    public void hopsFromHToBShouldBeOne() {
        assertEquals(1, h.hopsTo(b));
    }

    @Test
    public void minHopsFromHtoBShouldBeOne() {
        assertEquals(1, h.minHopsTo(b));
    }

    @Test
    public void minHopsFromACityToItselfShouldBeZero() {
        assertEquals(0, h.minHopsTo(h));
    }

    @Test
    public void minHopsFromHtoDShouldBeThree() {
        assertEquals(3, h.minHopsTo(d));
    }

    @Test
    public void minHopsFromHtoEShouldBeThree() {
        assertEquals(3, h.minHopsTo(e));
    }

    @Test
    public void fShouldNotBeAbleToReachG() {
        assertEquals(-1, f.minHopsTo(g));
    }

    @Test
    public void minHopsFromCtoBShouldBeTwo() {
        assertEquals(2, c.minHopsTo(b));
    }
}
