/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l07_methots;

/**
 *
 * @author bilsis
 */
public class AritmeticTest {

    public static void main(String args[]) {
//We create an object of the Arithmetic class
        Aritmetic a = new Aritmetic();
//We call the add method and receive the returned value
        int result = a.add(5, 3);
        System.out.println("Result:" + result);
    }
}
