/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Square extends Rectangle {

    //private double side;
    private Measurement squM1;

    public Square(double side, String unit) {
        //this.side = side;
        squM1 = new Measurement(side, unit);
        System.out.println("New Square: " + squM1);
    }

    @Override
    public String toString() {

        return "Square of: " + squM1.toString();
    }
}
