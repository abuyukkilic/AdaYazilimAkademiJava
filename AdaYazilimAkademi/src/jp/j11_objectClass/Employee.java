/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j11_objectClass;

import java.util.Objects;

/**
 *
 * @author bilsis
 */
public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee {" + "name=" + name + ", salary=" + salary + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.name.hashCode();
        hash = 31 * hash + Double.valueOf(this.salary).hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            if (name.equals(emp.name) && Double.valueOf(salary).equals(emp.salary)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
