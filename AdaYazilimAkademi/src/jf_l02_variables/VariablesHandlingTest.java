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
public class VariablesHandlingTest {

    public static void main(String[] args) {
//boolean variables (declaration)
        boolean flag1;
//inicialization of the boolean variable called flag1
        flag1 = true;
//Declare and initialize a new variable called flag2 of type boolean
        boolean flag2 = false;
        System.out.println("boolean flag1 value: " + flag1);
        System.out.println("boolean flag2 value: " + flag2);
        System.out.println();//prints a new line
//Byte Variables
        byte b1 = 10;//decimal value of 10
//Literal en hexadecimal starts with 0x
        byte b2 = 0xa;//0xa is hexadecimal, equals to 10 in decimal
        System.out.println("byte1 value:" + b1);
        System.out.println("byte2 value:" + b2);
        System.out.println("");//prints a new line too
//Short Variables
        short s1 = 2;
        System.out.println("short value:" + s1);
        System.out.println("");//prints a new line
//char Variable, declaration and inicializacion in one line of code
//The first declaration is in UNICODE
//http://www.icursos.net/referencias/TablaUnicode.html
        char ch1 = 65, ch2 = 'A';
        System.out.println("char1 value:" + ch1);//prints A (unicode value of 65)
        System.out.println("char2 value:" + ch2);//prints A
        System.out.println("");
//int Variables
        int decimal = 100;
        int octal = 0144;//An octal value starts with 0
        int hexa = 0x64;//An hexadecimal value starts with 0x or OX
        System.out.println("int decimal value:" + decimal);//printls 100
        System.out.println("int octal value:" + octal);//prints 100 too
        System.out.println("int hexadecimal value:" + hexa);//prints 100 too
        System.out.println();
//long variables
        long long1 = 10;//by default a literal is of type int
        long long2 = 20L;//with the sufix l or L the literal is converted to long
        System.out.println("long1 value:" + long1);
        System.out.println("long2 value:" + long2);
        System.out.println();
//Variables float
        float f1 = 15;//by default a float literal is of type double
        float f2 = 22.3F;//with the sufix f or F the literal is converted to float
        System.out.println("float1 value:" + f1);
        System.out.println("float2 value:" + f2);
        System.out.println();
//double Variables
        double d1 = 11.0;//by default a float literal is of type double
        double d2 = 30.15D;//with the sufix D, converts a literal to double
        System.out.println("double1 value:" + d1);
        System.out.println("double2 value:" + d2);
        System.out.println();
    }
}
