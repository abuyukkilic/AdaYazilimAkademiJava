/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j08_polymorphism;

/**
 *
 * @author bilsis
 */
public class Polymorphism {

    public static void main(String[] args) {
        Employee emp = new Employee("Aykut", 1000);
        printDetails(emp);
        Manager ger = new Manager("Aykut", 2000, "Yazılımcı");
        printDetails(ger);
    }
//We note that the type that receives the method is a parent type (Employee)
//However at the time of executing the method, the one of the son (Manager) is executed
//that is the polymorphism, multiple forms but in time of execution

    public static void printDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }

}
