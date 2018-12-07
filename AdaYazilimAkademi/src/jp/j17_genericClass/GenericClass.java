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
public class GenericClass<T> {
//We define a variable of generic type

    T object;
//Constructor that initializes the type to be used

    public GenericClass(T object) {
        this.object = object;
    }

    public void getType() {
        System.out.println("The type T is: " + object.getClass().getName());
    }
}
