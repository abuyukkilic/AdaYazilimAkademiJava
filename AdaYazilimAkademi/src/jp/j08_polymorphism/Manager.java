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
public class Manager extends Employee {

    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }


    @Override
    public String getDetails() {
        //Süper ile miras aldığımız fonksiyonun değerini alıp değiştiriyoruz...
        return super.getDetails() + ", department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
