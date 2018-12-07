/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j15_exeptionHandling;

/**
 *
 * @author bilsis
 */
public class Division {
    //attributes of the class

    private int numerator;
    private int denominator;

    public Division(int numerator, int denominator) throws OperationException {
        if (denominator == 0) {
            //throw new IllegalArgumentException("Denominator equal to zero");
            throw new OperationException("Payda 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void visualizeOperation() {
        System.out.println("The division result is: " + numerator / denominator);
    }
}
