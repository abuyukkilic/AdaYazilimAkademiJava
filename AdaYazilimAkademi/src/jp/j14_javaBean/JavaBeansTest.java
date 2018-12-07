/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j14_javaBean;

/**
 *
 * @author bilsis
 */
public class JavaBeansTest {

    public static void main(String[] args) {
        PersonBean bean = new PersonBean();
        bean.setName("Aykut");
        bean.setAge(29);
        System.out.println("Name:" + bean.getName());
        System.out.println("Age:" + bean.getAge());
    }
}
