/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_05_autoboxing;

/**
 *
 * @author bilsis
 */
public class AutoboxingAutounBoxingTest {

    public static void main(String[] args) {
        //Primitive tipinden Object tipine çevirmek autoboxing
        Integer intObj = 10;
        Float floatObj = 15.2F;
        Double doubleObj = 40.1;
        System.out.println("Autoboxing");
        System.out.println("intObj = " + intObj.intValue());
        System.out.println("floatObj = " + floatObj.floatValue());
        System.out.println("doubleObj = " + doubleObj.doubleValue());
        
        //Object tipinden primitive tipine çevirmek unboxing
        int intDeger = intObj;        
        float floatDeger = floatObj;        
        double doubleDeger = doubleObj;
        
        System.out.println("");
        System.out.println("AutoUnboxing");
        System.out.println("intDeger = " + intDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
    }

    
}
