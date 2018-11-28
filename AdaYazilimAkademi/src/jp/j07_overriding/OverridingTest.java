/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j07_overriding;

/**
 *
 * @author bilsis
 */
public class OverridingTest {

    public static void main(String[] args) {
        
        Employee employee = new Employee("Aykut", 1000);
        System.out.println(employee.getDetails());
        
        Manager manager = new Manager("Aykut", 2000, "Yazılımcı");
        System.out.println(manager.getDetails());

    }
}
