/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l06_CreateClass;

/**
 *
 * @author bilsis
 */
public class Person {
    //Class attributes
//It is not necessary to assign values
//The compiler assigns default values

    int id;
    String firstName;
    String lastName;
//Class methods
//The objects of this class will use this method

    public void showPerson() {
        System.out.println("id : " + id);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
    }

}
