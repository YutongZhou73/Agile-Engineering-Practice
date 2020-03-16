package edu.berkeley.aep;

public class Rectangle {

    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // static factory method
    // can be directly called without calling the constructor
    // an alternative constructor
    // have a name, better express intent
    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return (width + length) * 2;
    }
}
