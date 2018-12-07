/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j20_dataInputScanner;

import java.util.Scanner;

/**
 *
 * @author bilsis
 */
public class DataInputScannerTest {

    public static void main(String[] args) {
        String capture;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a data:");
        capture = scan.nextLine();
        while (capture != null) {
            System.out.println("Data entered:" + capture);
            capture = scan.nextLine();
        }
    }

}
