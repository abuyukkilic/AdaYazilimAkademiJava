/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j15_exeptionHandling;

/**
 *
 * @author bilsis
 */
public class ExeptionHandlingTest1 {

    public static void main(String[] args) {
        try {
            Division division = new Division(10, 0);
            division.visualizeOperation();
        } catch (OperationException oe) {
            System.out.println("Hata meydana geldi!!!");
            oe.printStackTrace(System.out);
        }
    }
}
