/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Circle {
    private double radius;
    private Measurement cirM1;
    private Measurement cirA1;
    private Measurement cirC1;
    
    public Circle(){
        double r = radius;
    }
    public Circle (double radius){
        this.radius = radius;
        System.out.println("New Circle: "+radius);
        
    }
    public Measurement getCircumference(){
        double c;
        c = 2*Math.PI*radius;
        cirC1 = new Measurement(c,"cow's grass");
        return cirC1;
    }
    
}
