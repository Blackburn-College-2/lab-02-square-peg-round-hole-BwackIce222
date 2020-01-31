/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Rectangle{
    private double length = 1;
    private double width = 1;
    
    public  Rectangle(){
        double l = this.length;
        double w = this.width;
   
        
    }
    public Rectangle(double width, double length,String unit){
        this.width = width;
        this.length = length;  
        Measurement recM1 = new Measurement(length,unit);
        
        Measurement recM2 = new Measurement(width,unit);
        
        System.out.println("New rectangle: " +recM2+ " by "+ recM1);
    }
    public double getLength(){
     return length ;  
    }
    public double getWidth(){
        return width;
    }
   public double getArea(){
       double area = width*length;
        return area;
    }
   public double getPerimeter(){
       double perimeter = 2*width+2*length;
       return perimeter;
   }
    @Override
   public String toString(){
      return "Rectangle of " + width + " by " + length; 
   }        
    
}
