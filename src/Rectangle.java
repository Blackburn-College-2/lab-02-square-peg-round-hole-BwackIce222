/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Rectangle {

    private double length;
    private double width;
    private Measurement recM1;
    private Measurement recM2;

    public Rectangle() {
        double l = this.length;
        double w = this.width;

    }

    public Rectangle(double width, double length, String unit) {
        this.width = width;
        this.length = length;
        recM1 = new Measurement(width, unit);

        recM2 = new Measurement(length, unit);

        System.out.println("New rectangle: " + recM1 + " by " + recM2);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle of: " + recM1.toString() + " by " + recM2.toString();

    }

    public String getEfficiency() {
        return "The efficiency is: " + getArea() / getPerimeter() + "";
    }

}
