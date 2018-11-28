/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_06_accessModifiers.package1;

/**
 *
 * @author bilsis
 */
public class Class2 {

    public Class2() {
        //Class1'i buradan test edelim.
        System.out.println("");
        //Public constructor
        new Class1(1);
        //Protected constructor
        new Class1(1, 2);
        //Package constructor
        new Class1(1, 2, 3);
        //Private constructor
        //new Class1(1,2,3,4); Private class2 den class1'e erişim yok.
        System.out.println("Class2'den Class1'in private öğelerine erişim yok.");

    }

    public void testFromClass2() {
        //Class2 den Class1'e bir obje ile erişip hangi değişkenlere erişebileceğimize bir bakalım.
        Class1 c1 = new Class1();
        System.out.println("");
        System.out.println("Public Attribute: " + c1.publicAttribute);
        System.out.println("Protected Attribute: " + c1.protectedAttribute);
        System.out.println("Package attribute: " + c1.packageAttribute);
        //System.out.println("Private Attribute: " + c1.privateAttribute);//has private access        
        System.out.println("Private Attribute: Access Denied");
        
        System.out.println("");
        System.out.println("Public Method: " + c1.publicMethod());
        System.out.println("Protected Method: " + c1.protectedMethod());
        System.out.println("Default Method: " + c1.packageMethod());
        //System.out.println("Private Method :" + c1.privateMethod());//has private access
        System.out.println("Private Method: Access Denied");
    }
}
