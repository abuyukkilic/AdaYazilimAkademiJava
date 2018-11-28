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
public class Class3 extends Class1 {

    public Class3() {

        //super(1); // public erişim var   
        super(1, 2); //extend olduğu classlardan farklı package altında olsa bile protected erişimi var
        //super(1,2,3); //farklı package olduğu için package üzerinden erişim yok
        //super(1,2,3,4); //private sadece kendi class'ı üzerinden erişilebilir.
    }

    public void testFromClass3() {
        //Access to Class1 from Class3
        //Remember that Class3 extends from Class1
        Class1 c1 = new Class1();
        System.out.println("");
        System.out.println("public attribute:" + c1.publicAttribute + " or inherited:" + this.publicAttribute);
        System.out.println("protected attribute (inherited):" + this.protectedAttribute);
        System.out.println("Default attribute: Can not be accessed from an external package");
        System.out.println("Private attribute: Access denied");
        //public constructor
        new Class1();
        //The other constructors can not be tested like this, but from the constructor of this class
        //since this is a subclass in another package
        System.out.println("");
        System.out.println("public method:" + c1.publicMethod());
        System.out.println("protected method (inherited):" + protectedMethod());
        System.out.println("package method: Can not be accessed from an external package");
        System.out.println("Private method: Access denied");
    }

}
