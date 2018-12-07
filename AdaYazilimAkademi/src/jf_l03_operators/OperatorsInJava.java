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
public class OperatorsInJava {

    public static void main(String[] args) {
        System.out.println("Aritmetic Operators:");
        int a = 1 + 2;//a=3
        int b = a * 4;//b=3*4 => b=12
        int c = b / 2;//c=12/2 => c=6 (the division gives an int result, not float)
        int d = c - a;//b=6-3 => d=3
        int e = -d;//e=-3
        System.out.println("a = " + a);//prints a=3
        System.out.println("b = " + b);//prints b=12
        System.out.println("c = " + c);//prints c=6
        System.out.println("d = " + d);//prints d=3
        System.out.println("e = " + e);//prints e=-3
        System.out.println("\nOperator Module (residue of the division):");
        System.out.println("x mod 2 = " + a % 2);//3%2 => 1 (int residue)
        System.out.println("\nComposite Operator:");
        a += 2;//a=a+2 => a=3+2 => a=5
        b -= 4;//b=b-4 => b=12-4 => b=8
        c *= a;//c=c*a => c=6*5 => c=30
        System.out.println("a = " + a);//prints a=5
        System.out.println("b = " + b);//prints b=8
        System.out.println("c = " + c);//prints c=30
        System.out.println("\nIncrement Operator:");
        a++;//a=a+1
        System.out.println("a = " + a);//prints a=6
//Preincrement/decrement (is increased before using the value)
        c = ++a;//c=(a+1) => c=7
//Postincrement/decrement (is increased after using the value)
//The next time b is used, it is when it's increased
        d = b++;//d=b => d=8
        System.out.println("b = " + b);//prints b=9, b was waiting to increase the next time it was used
        System.out.println("c = " + c);//prints c=7
        System.out.println("d = " + d);//prints c=8
        System.out.println("\nRelational operator:");
        boolean res = a < b;//a is less than b => res=7<9 => res=true
        System.out.println("res = " + res);
        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;//(7<9)=true => assign first value (a), if not assign second value (b)
        System.out.println("min = " + min);//prints a => min = 7
        System.out.println("\nAssignment Operator:");
        int i, j, k;
//Many assignments at one time
        i = j = k = 100; // i, j, and k are equal to 100
        System.out.println("i = " + i);//prints i=100
        System.out.println("j = " + j);//prints j=100
        System.out.println("k = " + k);//prints k=100
    }
}
