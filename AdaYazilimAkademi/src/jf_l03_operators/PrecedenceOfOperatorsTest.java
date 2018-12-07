/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l03_operators;

/**
 *
 * @author bilsis
 */
public class PrecedenceOfOperatorsTest {

    public static void main(String[] args) {
        System.out.println("First Example Precedence of Operators");
        int x = 5;
        int y = 10;
        int z = ++x * y--;//z=6*10 => z=60
        System.out.println("x = " + x);//prints x=6
        System.out.println("y = " + y);//prints y=9, it was pending the decrease
        System.out.println("z = " + z);//prints 60
        System.out.println("Example of Evaluation");
        System.out.println(4 + 5 * 6 / 3);//4+(5*6)/3 => 4+(30/3) => 4+10 => 14
        System.out.println((4 + 5) * (6 / 3));//9*2=> 18
        System.out.println("Another Evaluation Example");
        System.out.println(1 + 2 - 3 * 4 / 5);//(1+2)-(3*4)/5 => 3-(12/5) => 3-2 => 1
        System.out.println(1 + 2 - (3 * (4 / 5)));//3-(3*0) => 3-0 => 3, the division takes the int part 
        System.out.println("\nAnother example");
//If it detects a String, the rest turns it into a String
        System.out.println("1 + 2 = " + 1 + 2);//concatenates, prints 12
//The parentheses break this rule, as it has the highest priority
        System.out.println("(1 + 2) = " + (1 + 2));//prints 3
        System.out.println("\nAnother example");
//The + operator is associative to the left
        System.out.println(1 + 2 + "abc");//Detects an operation first, prints 3abc
        System.out.println("abc" + 1 + 2);//Detects a String first, prints abc12
    }

}
