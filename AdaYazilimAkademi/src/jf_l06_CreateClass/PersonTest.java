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
public class PersonTest {

    public static void main(String args[]) {
//Creation of an object
        Person p1 = new Person();
//Calling a method of the created object
        System.out.println("Default values of the Person object");
        p1.showPerson();
//Modify values
        p1.id = 1;
        p1.firstName = "Rita";
        p1.lastName = "Brown";
//We call the method again
        System.out.println("\nNew values for the Person object");
        p1.showPerson();
    }
}
