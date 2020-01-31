/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Measurement {
    private double value;
    private String unit;
    
    public Measurement(double value, String unit){
        this.value = value;
        this.unit = unit;   
    }
    
    @Override
    public String toString(){
        return value + " " + unit; 
    }
}
