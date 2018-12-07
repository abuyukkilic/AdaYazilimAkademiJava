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
public class DoWhileLoopTest {

    public static void main(String[] args) {
        int counter = 0;
        int limit = 10;
        do {
//At least executed the first time
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < limit);
    }

}
