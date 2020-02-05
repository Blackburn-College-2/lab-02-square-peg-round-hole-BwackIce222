/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Ellipse {
    private double xRadius;
    private double yRadius;
    private Measurement ellM1;
    private Measurement ellM2;
    private Measurement ellA1;
    private Measurement ellC1;

    
    
    public Ellipse(){
        double x = xRadius;
        double y = yRadius;
        
    }
    public Ellipse(double xRadius, double yRadius){
      this.xRadius = xRadius;
      this.yRadius = yRadius;
        System.out.println("New Ellipse: "+ xRadius+ " by " + yRadius);
      
    }
    public Measurement getCircumference(){
        double c;
        c = Math.PI*(3*(xRadius+yRadius)-Math.sqrt((3*xRadius+yRadius)*(xRadius+3*yRadius)));
        ellC1 = new Measurement(c,"cow's grass");
        return ellC1;
    }
    public Measurement getArea(){
        double a;
        a = Math.PI*xRadius*yRadius;
        ellA1 = new Measurement(a,"cow's grass");
        return ellA1;
    }
   
    
}
