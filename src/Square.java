/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */

public class Square extends Rectangle{
    private double side;
    
    public Square(double side){
        this.side = side;
        System.out.println("New Square: "+side);
    }
    @Override
   public String toString(){
     
      return "Square of "+ side; 
   }      
}
