/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j11_objectClass;

/**
 *
 * @author bilsis
 */
public class ObjectClass {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Aykut", 1000);
        Employee emp2 = new Employee("Aykut", 1000);
        
        compareObjects(emp1,emp2);

    }

    private static void compareObjects(Employee emp1, Employee emp2) {
        System.out.println("Object Content:" + emp1);

        //Revision by reference
        if (emp1 == emp2) {
            System.out.println(" Objelerin memori adresleri aynı.");
        } else {
            System.out.println(" Objeler farklı memori adreslerinde tutuluyor.");
        }

        if (emp1.equals(emp2)) {
            System.out.println("Objelerin içerikleri aynı.");
        } else {
            System.out.println("Objelerin içerikleri farklı.");
        }

        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Objelerin hashcodeleri aynı");
        } else {
            System.out.println("Objelerin hashcodeleri farklı");
        }
    }
}
