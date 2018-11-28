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
public class Employee {

    protected String name;
    protected double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Adı: " + name + ", Maaşı: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
