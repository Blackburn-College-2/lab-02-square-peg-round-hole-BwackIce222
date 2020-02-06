/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates an Equilateral Triangle, below are the attribute(s); side
public class Equilateral_Triangle extends Isosceles_Triangle {

    private double side;

    private Measurement triA;

    //Creates a default equilateral Triangle
    public Equilateral_Triangle() {
        double a = this.side;

    }
    //Creates an Equilateral Triangle with the given parameters below and prints 
    //out the construction of the object to the screen and it's attributes

    public Equilateral_Triangle(double a, String unit) {
        this.side = a;

        triA = new Measurement(a, "inches");

        System.out.println("New triangle: " + triA + " by " + triA + " by "
                + triA);

    }
    //returns the area

    public double getArea() {
        double s = (side * 3) / 2;
        double area = Math.sqrt(s * (s - side) * (s - side) * (s - side));

        return area;
    }
    //returns the peremeter

    public double getPerimeter() {
        double perimeter = side * 3;
        return perimeter;
    }
    //Overrides the toString method of Isosceles Triangle

    @Override
    public String toString() {
        return "Triangle of: " + triA.toString() + " by " + triA.toString()
                + " "
                + "by " + triA.toString();
    }

}
