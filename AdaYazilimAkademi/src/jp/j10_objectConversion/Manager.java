/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j10_objectConversion;

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
//overwrite the inherited parent method

    public String getDetails() {
//In order not to repeat code, we can use
//the parent method and only add the child attribute
        return super.getDetails() + ", department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
