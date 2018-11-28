/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j04_foreach;

/**
 *
 * @author bilsis
 */
public class Person {
    private final int personId;
    private String name;
    private static int peopleCounter;

    public Person(String name) {
        personId = ++peopleCounter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getPersonId(){
        return this.personId;
    }
    

    
    
    
    
    
}
