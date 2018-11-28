/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j07.overriding;

/**
 *
 * @author bilsis
 */
public class Manager extends Employee {

    private String deparment;

    public Manager(String name, double salary, String deparment) {
        super(name, salary);
        this.deparment = deparment;
    }
    
    
    //Override the inherited method
    @Override
    public String getDetails() {
    //Name ve Salary nasıl erişiyoruz?
    //Name ve Salary Employee sınıfı içerisinde protected belirlediğimiz için
    //Protected öğelere child class üzerinden direk erişebiliriz.
        return "Ad: " + name
                + ", Maaş: " + salary
                + ", Departman: " + deparment;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
}
