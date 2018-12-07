/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l02_variables;

/**
 *
 * @author bilsis
 */
public class StringHandling {

    public static void main(String[] args) {
        String firstName = "Joan";
        String lastName = "Smith";
        System.out.println("Concatenation:" + firstName + " - " + lastName);
        System.out.println("New line: \n" + firstName + " " + lastName);
        System.out.println("Tab: \t" + firstName + " " + lastName);
        System.out.println("Backward: \b" + firstName + " " + lastName);
        System.out.println("Carriage return: \r" + firstName + " " + lastName);
        System.out.println("Simple quote: \'" + firstName + " " + lastName + "\'");
        System.out.println("Double quote: \"" + firstName + " " + lastName + "\"");
    }
}
