/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_06_accessModifiers.package2;

import jp_06_accessModifiers.package1.Class1;

/**
 *
 * @author bilsis
 */
public class Class4 {

    public Class4() {

        // Protected constructor, restricted by not being a subclass
        // super (1,2);
        // Access package, and being out of package is restricted
        // super (1,2,3);
        // Private access, restricted
        // super (1,2,3,4);
    }

    public void testFromClass4() {
        // Access to Class 1 from Class4
        // Class4 is NOT subclassed and is in another package
        Class1 c1 = new Class1();
        System.out.println("");
        System.out.println("Public attribute:" + c1.publicAttribute);
        System.out.println("Protected attribute: Can not be accessed from an external package by NOT being a subclass");
        System.out.println("Default attribute: Can not be accessed from an external package");
        System.out.println("Private attribute: Access denied");
        // Public constructor
        new Class1();
        // the other constructors are restricted
        System.out.println("");
        System.out.println("Public method:" + c1.publicMethod());
        System.out.println("Protected method: Can not be accessed from an external package by NOT being a subclass");
        System.out.println("Default method: Can not be accessed from an external package");
        System.out.println("Private method: Access denied");
    }

}
