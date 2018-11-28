/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j06_accessModifiers.test;

import jp.j06_accessModifiers.package1.Class2;
import jp.j06_accessModifiers.package2.Class3;
import jp.j06_accessModifiers.package2.Class4;

/**
 *
 * @author bilsis
 */
public class AccessModifierTest {

    public static void main(String[] args) {
// Test access to Class1 from other classes
// Access to Class 1 from Class2
        System.out.println("*** Access from Class 2 to Class 1 (same package) ***");
        new Class2().testFromClass2();
// Access to Class 1 from Class3
// Class 3 extends Class 1
        System.out.println("\n *** Access from Class 3 to Class 1 (different package, but subclass) ***");
        new Class3().testFromClass3();
// Access to Class 1 from Class4
// Class4 is NOT subclassed and is in another package
        System.out.println("\n *** Access from Class 4 to Class 1 (different package, NOT subclass) ***");
        new Class4().testFromClass4();
    }
}
