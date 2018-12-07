/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j14_javaBean;

/**
 *
 * @author bilsis
 *///1. Implement the Serializable interface of the java.io package
public class PersonBean implements java.io.Serializable {
//2. Each property is of private type

    private String name;
    private int age;
//3. Always have a Constructor without arguments
//Other Constructors are optional

    public PersonBean() {
    }
//Constructor of the JavaBean with 2 arguments (Not required)

    public PersonBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
