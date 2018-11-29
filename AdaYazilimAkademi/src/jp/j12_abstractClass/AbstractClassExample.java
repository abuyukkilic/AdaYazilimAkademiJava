/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j12_abstractClass;

/**
 *
 * @author bilsis
 */
public class AbstractClassExample {

    public static void main(String[] args) {
        //Creation of objects
        GeometricFigure rectangle = new Rectangle("Rectangle");
        GeometricFigure triangle = new Triangle("Triangle");
        GeometricFigure circle = new Circle("Circle");
        
       
        
        System.out.println(rectangle);
        rectangle.draw();
        
        System.out.println("");
        System.out.println(triangle);
        triangle.draw();
        
        System.out.println("");
        System.out.println(circle);
        circle.draw();

    }
}
