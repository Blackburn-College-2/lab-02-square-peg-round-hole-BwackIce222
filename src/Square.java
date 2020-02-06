/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creates a Square, below are the attribute(s); square
public class Square extends Rectangle {

    private double side;
    private Measurement squM1;
//Creates a Square objects given the parameters

    public Square(double side, String unit) {
        this.side = side;
        squM1 = new Measurement(side, unit);
        System.out.println("New Square: " + squM1);
    }

    //Overrides the toString method of the Parent class
    @Override
    public double getPerimeter() {
        double perimeter = 4 * side;
        return perimeter;

    }

    //Overrides the toString method of the Parent class
    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }
//Overrides the toString method of Square

    @Override
    public String toString() {

        return "Square of: " + squM1.toString();
    }
}
