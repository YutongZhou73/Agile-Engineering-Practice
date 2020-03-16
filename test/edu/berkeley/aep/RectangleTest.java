package edu.berkeley.aep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleWithSideTwoShouldHaveAreaFour() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(4, rectangle.area());
    }

    @Test
    public void rectangleWithSideOneShouldHaveAreaOne() {
        var rectangle = new Rectangle(1,1);
        assertEquals(1, rectangle.area());
    }
}
