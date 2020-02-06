/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Creats a Triangle objects, below are the parameters; sidea, sideb and sidec
public class Triangle {

    private double sidea;
    private double sideb;
    private double sidec;
    private Measurement triA;
    private Measurement triB;
    private Measurement triC;

    //creates a default triangle object
    public Triangle() {
        double a = this.sidea;
        double b = this.sideb;
        double c = this.sidec;
    }

    //creates a triangle object using the given parameters
    public Triangle(double a, double b, double c, String unit) {
        this.sidea = a;
        this.sideb = b;
        this.sidec = c;

        triA = new Measurement(a, unit);
        triB = new Measurement(b, unit);
        triC = new Measurement(c, unit);

        System.out.println("New triangle: " + triA
                + " by " + triB + " by " + triC);
    }

    //returns sidea
    public double getSideA() {
        return sidea;
    }

    //returns sideb
    public double getSideB() {
        return sideb;
    }
    //returns sidec

    public double getSideC() {
        return sidec;
    }
    //returns the area

    public double getArea() {
        double s = (sidea + sideb + sidec) / 2;
        double area = Math.sqrt(s * (s - sidea) * (s - sideb) * (s - sidec));

        return area;
    }
    //returns the peremeter

    public double getPerimeter() {
        double perimeter = sidea + sideb + sidec;
        return perimeter;
    }
    //Overrides the toString method of Triangle

    @Override
    public String toString() {
        return "Triangle of: " + triA.toString() + " by " + triB.toString()
                + " by " + triC.toString();

    }

    //Finds the ratio of the Triangles area to Perimeter
    public String getEfficiency() {
        return "The efficiency is: " + getArea() / getPerimeter() + "";
    }
}
