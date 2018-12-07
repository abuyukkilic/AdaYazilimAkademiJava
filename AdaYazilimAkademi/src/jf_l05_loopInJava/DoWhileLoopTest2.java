/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l05_loopInJava;

import java.util.Scanner;

/**
 *
 * @author bilsis
 */
public class DoWhileLoopTest2 {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements to iterate:");
        int maxElements;
        Scanner scanner = new Scanner(System.in); //Creation of the Scanner object to read data
        maxElements = scanner.nextInt(); //We read the value provided by the user
        int counter = 0;
        do {
//At least executed the first time
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < maxElements);
    }
}
