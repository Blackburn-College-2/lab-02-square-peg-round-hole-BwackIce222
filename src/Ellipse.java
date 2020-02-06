/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Here are the attributes of the Ellipse, including; the two radii, units, area
//and circumference
public class Ellipse {

    private double xRadius;
    private double yRadius;
    private Measurement ellM1;
    private Measurement ellM2;
    private Measurement ellA1;
    private Measurement ellC1;
    private String unit;

    //Creates a default Ellipse
    public Ellipse() {
        double x = xRadius;
        double y = yRadius;

    }

    //Creates an Ellipse with the given parameters
    public Ellipse(double xRadius, double yRadius, String unit) {
        this.xRadius = xRadius;
        this.yRadius = yRadius;
        System.out.println("New Ellipse: " + xRadius + " " + unit + " by "
                + yRadius + " inches");
        ellM1 = new Measurement(xRadius, unit);
        ellM2 = new Measurement(yRadius, unit);

    }

    //Finds the circumference of the Ellipse and uses the Measurement 
    //class to print it ou to the screen
    public Measurement getCircumference() {
        double c;
        c = Math.PI * (3 * (xRadius + yRadius) - Math.sqrt((3 * xRadius
                + yRadius)
                * (xRadius + 3 * yRadius)));
        ellC1 = new Measurement(c, unit);
        return ellC1;
    }

    //Finds the area of the Ellipse and uses the Measurement class to 
    //print it out to the screen
    public Measurement getArea() {
        double a;
        a = Math.PI * xRadius * yRadius;
        ellA1 = new Measurement(a, unit + " squared");
        return ellA1;
    }

    //Finds the ratio of the Ellipse's area to peremeter
    public String getEfficiency() {
        return "The efficiency is: " + getArea().getValue()
                / getCircumference().getValue() + "";
    }
    //Overrrides the toString method for Ellipse

    @Override
    public String toString() {
        return "Ellipse of: " + ellM1.toString() + " by " + ellM2.toString();

    }

}
