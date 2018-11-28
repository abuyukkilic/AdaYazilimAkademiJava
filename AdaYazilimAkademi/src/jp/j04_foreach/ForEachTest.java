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
public class ForEachTest {

    public static void main(String[] args) {
       
        int[] ages = {15, 20, 41, 50};
        for (int age : ages) {
            System.out.println("Yaş :" + age);
        }
        
        Person[] people = {new Person("Aykut"), new Person("Ada"), new Person("Dicle")};
        
        System.out.println("");
        
        for(Person p : people){
            int personId = p.getPersonId();
            String name = p.getName();
            System.out.println("Kişi Id: "+ personId + " Adı = " + name);
        }

    }
}
