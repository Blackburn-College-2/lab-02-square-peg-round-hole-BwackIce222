/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates an isosceles triangle, below are the attributes; sideA and twinSides
public class Isosceles_Triangle extends Triangle {

    private double sideA;
    private double twinSides;
    private Measurement isotriA;
    private Measurement isotriTwins;

    //creates a default Isosceles Triangle object
    public Isosceles_Triangle() {
        double a = this.sideA;
        double b = this.twinSides;
        double c = this.twinSides;
    }

    //Creates a Isosceles Triangle with the parameters below and prints out the 
    //constuction of the object and its attributes
    public Isosceles_Triangle(double sideA, double twinSides, String unit) {
        this.sideA = sideA;
        this.twinSides = twinSides;
        this.twinSides = twinSides;

        isotriA = new Measurement(sideA, unit);
        isotriTwins = new Measurement(twinSides, unit);
        isotriTwins = new Measurement(twinSides, unit);

        System.out.println("New isosceles triangle: " + isotriA + " by "
                + isotriTwins + " by " + isotriTwins);
    }
    //returns the area

    public double getArea() {
        double s = (sideA + twinSides) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - twinSides)
                * (s - twinSides));

        return area;
    }
    //returns the peremeter

    public double getPerimeter() {
        double perimeter = sideA + (2 * twinSides);
        return perimeter;
    }

    //returns the length of the twin sides of the triangle
    public double getTwinSides() {
        return twinSides;
    }
    //Overrides the toString method of Isosceles Triangle

    @Override
    public String toString() {
        return "Triangle of: " + isotriA.toString() + " by "
                + isotriTwins.toString() + " by " + isotriTwins.toString();

    }
}
