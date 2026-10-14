package edu.txst.assignment2;

/**
 * Represents a Rectangle shape implementing the Shape interface.
 */
public class Rectangle implements Shape {
    private double width;
    private double length;

    /**
     * Constructs a Rectangle with the specified width and length.
     *
     * @param width the width of the rectangle
     * @param length the length (or height) of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle (" + width + "x" + length + ")";
    }
}
