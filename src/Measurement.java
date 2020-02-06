/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
//Class thats prints values of other shape opjects with their appropriate units.
//Below are the private attributes, value and unit
public class Measurement {

    private double value;
    private String unit;
//Creates an instance of a measurement and takes in the paramters double 
    //and String

    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    //Returns the value of an aspects of a shape's parameters
    public double getValue() {
        return value;
    }
// Overrides the toString method for Measurement

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
