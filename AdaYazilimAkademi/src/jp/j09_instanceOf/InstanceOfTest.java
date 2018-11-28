/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j09_instanceOf;

/**
 *
 * @author bilsis
 */
public class InstanceOfTest {

    public static void main(String[] args) {
        GeometricFigure figure = new Ellipse();
        figure.draw();

        System.out.println("----------------");
        determineType(figure);
        
        System.out.println("----------------");
        determinesAllTypes(figure);

    }

    private static void determineType(GeometricFigure figure) {
        if (figure instanceof Ellipse) {
//Process something particular of the Ellipse
            System.out.println("It is an Ellipse");
        } else if (figure instanceof Circle) {
//Process something particular of the Circle
            System.out.println("It is a Circle");
        } else if (figure instanceof GeometricFigure) {
//Process something particular of the Geometrical Figure
            System.out.println("It is a Geometrical Figure");
        } else if (figure instanceof Object) {
//Process something particular from the Object class
            System.out.println("It is an Object");
        } else {
            System.out.println("The type was not found");
        }
    }

    private static void determinesAllTypes(GeometricFigure figure) {
        if (figure instanceof Ellipse) {
            System.out.println("It is an Ellipse");
        }
        if (figure instanceof Circle) {
            System.out.println("It is a Circle");
        }
        if (figure instanceof GeometricFigure) {
            System.out.println("It is a Geometrical Figure");
        }
        if (figure instanceof Object) {
            System.out.println("It is an Object");
        } else {
            System.out.println("The type was not found");
        }
    }

}
