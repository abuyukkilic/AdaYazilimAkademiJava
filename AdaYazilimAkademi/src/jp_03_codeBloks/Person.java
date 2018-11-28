/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_03_codeBloks;

/**
 *
 * @author bilsis
 */
public class Person {
    private final int PERSONID;
    private static int peopleCounter;
    
    static {
        System.out.println("Static blok çalıştı");
        peopleCounter = 10;
    }
    
    {
        System.out.println("Initialize blok çalıştı");
        PERSONID = ++ peopleCounter;
    }
    
    Person(){
        System.out.println("Constructor çalıştı");
    }
    
    public int getPersonId(){
        return PERSONID;
    }
}
