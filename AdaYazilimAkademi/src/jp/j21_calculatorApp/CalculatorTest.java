/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j21_calculatorApp;

import java.util.Scanner;
import static jp.j21_calculatorApp.Calculator.add;

/**
 *
 * @author bilsis
 */
public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Provides the first value:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Provides the second value:");
        int b = scan.nextInt();
        int result = add(a, b);
        System.out.println("The result of the sum is:" + result);
    }

}
