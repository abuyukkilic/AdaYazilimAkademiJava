/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j06_accessModifiers.package1;

/**
 *
 * @author bilsis
 */
public class Class1 {

    public int publicAttribute = 5;
    protected int protectedAttribute = 6;
    int packageAttribute = 7;
    private int privateAttribute = 8;
    
    //Default Constructor
    public Class1() {
    }

    public Class1(int i) {
        System.out.println("Public Class1");
    }

    protected Class1(int i, int j) {
        System.out.println("Protected Class1");
    }

    Class1(int i, int k, int l) {
        System.out.println("Package Class1");
    }

    private Class1(int i, int k, int l, int m) {
        System.out.println("Private Class1");
    }

    //Method definitions
    public int publicMethod() {
        return 9;
    }

    protected int protectedMethod() {
        return 10;
    }

    int packageMethod() {
        return 11;
    }

    private int privateMethod() {
        return 12;
    }

}
