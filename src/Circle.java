/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
// Here are the attributes of the circle including; radius, area and 
//circumference
public class Circle extends Ellipse {

    private double radius;
    private Measurement cirM1;
    private Measurement cirA1;
    private Measurement cirC1;
    private String unit;

    //creates a default circle
    public Circle() {
        double r = radius;
    }

    //creates a circle with the given parameters
    public Circle(double radius, String unit) {
        this.radius = radius;
        System.out.println("New Circle: " + radius + " " + unit);
        cirM1 = new Measurement(radius, unit);

    }

    //Finds the circumference of the circle and uses the measurement class 
    //to print it out to the screen with its units
    public Measurement getCircumference() {
        double c;
        c = 2 * Math.PI * radius;
        cirC1 = new Measurement(c, unit);
        return cirC1;
    }

    //Finds the are of the circle and uses the measurement class to print it 
    //out to the screen with its units
    public Measurement getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        cirA1 = new Measurement(area, unit + " squared");
        return cirA1;
    }

    //overrides the toString method of Circle
    @Override
    public String toString() {
        return "Circle of radius: " + cirM1.toString();

    }
}
