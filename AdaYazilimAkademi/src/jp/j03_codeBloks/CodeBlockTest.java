/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j03_codeBloks;

/**
 *
 * @author bilsis
 */
public class CodeBlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        int id = p1.getPersonId();
        System.out.println("Kişi ID: " + id);
        
        //Static blok bir kez çalışır
        //Initialize blok her obje oluştuğunda çalışır.
        Person p2 = new Person();
        int id2 = p2.getPersonId();
        System.out.println("Kişi ID: " + id2);
    }
}
