/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates a rectangle, below are the attributs of the Rectangle. Length 
//and width


public class Rectangle {

    private double length;
    private double width;
    private Measurement recM1;
    private Measurement recM2;
//Creats a default rectangle

    public Rectangle() {
        double l = this.length;
        double w = this.width;

    }
//Creates a Rectangle objects that will take in the given parameters

    public Rectangle(double width, double length, String unit) {
        this.width = width;
        this.length = length;
        recM1 = new Measurement(width, unit);

        recM2 = new Measurement(length, unit);

        System.out.println("New rectangle: " + recM1 + " by " + recM2);
    }
//returns the length of the Rectangle

    public double getLength() {
        return length;
    }
//return the width of the Rectangle

    public double getWidth() {
        return width;
    }
//returns the area of the rectangle

    public double getArea() {
        double area = width * length;
        return area;
    }
//returns the peremeter of the Rectangle

    public double getPerimeter() {
        double perimeter = 2 * width + 2 * length;
        return perimeter;
    }
//Overrides the toString method for Rectangle

    @Override
    public String toString() {
        return "Rectangle of: " + recM1.toString() + " by " + recM2.toString();

    }
//Finds the ratio between area to perimeter

    public String getEfficiency() {
        return "The efficiency is: " + getArea() / getPerimeter() + "";
    }

}
