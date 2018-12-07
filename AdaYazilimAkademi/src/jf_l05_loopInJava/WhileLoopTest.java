/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l05_loopInJava;

/**
 *
 * @author bilsis
 */
public class WhileLoopTest {

    public static void main(String[] args) {
        int counter = 0;
        int limit = 10;
//Prints from 0 to 9 (10 elements)
        while (counter < limit) {
            System.out.println("counter = " + counter);
            counter++;
        }
    }
}
