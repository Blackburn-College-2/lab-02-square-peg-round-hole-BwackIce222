/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul.kline/montreal.thomas
 */
import java.util.Scanner;

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2, 5, "inches");
        System.out.println(rec1);
        System.out.println(rec1.getEfficiency());
        
        Square squ1 = new Square(2, "inches");
        System.out.println(squ1);
        System.out.println(squ1.getEfficiency());
        
        Ellipse ell1 = new Ellipse(4, 5, "inches");
        System.out.println(ell1);
        System.out.println(ell1.getEfficiency());
        
        Circle cir1 = new Circle(7.0, "inches");
        System.out.println(cir1);
        System.out.println(cir1.getEfficiency());
        
        Triangle tri1 = new Triangle(1,1,1,"inches");
        System.out.println(tri1);
        System.out.println(tri1.getEfficiency());
        
        Isosceles_Triangle iso1 = new Isosceles_Triangle(4,7,"inches");
        System.out.println(iso1);
        System.out.println(iso1.getEfficiency());
        
        Equilateral_Triangle equ1 = new Equilateral_Triangle(10,"inches");
        System.out.println(equ1);
        System.out.println(equ1.getEfficiency());

    }

}
