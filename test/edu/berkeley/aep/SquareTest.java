package edu.berkeley.aep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {
    @Test
    public void squareWithSideTwoShouldHaveAreaFour() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    public void squareWithSideTwoShouldHavePerimeterEight() {
        Square square = new Square(2);
        var square2 = Rectangle.createSquare(2);
        assertEquals(8, square.perimeter());
        assertEquals(8, square2.perimeter());
    }
}
