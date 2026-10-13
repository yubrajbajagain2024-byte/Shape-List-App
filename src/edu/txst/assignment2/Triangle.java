
package edu.txst.assignment2;

/**
 * Represents a triangle with a base and height.
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getClassName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    }
}
