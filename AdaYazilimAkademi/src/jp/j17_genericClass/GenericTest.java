/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j17_genericClass;

/**
 *
 * @author bilsis
 */
public class GenericTest {

    public static void main(String[] args) {
        //We created an instance of GenericClass for Integer.
        GenericClass<Integer> intObject = new GenericClass<>(15);
        intObject.getType();
        //We created an instance of GenericClass for String.
//The inference of the type on the right side can be used
        GenericClass<String> objetoStr = new GenericClass<>("Test");
        objetoStr.getType();
//Generics can not be applied to primitive types
//So this would mark a compilation error
//GenericClass<int> intPrimitivo = new GenericClass<>(88);
    }
}
