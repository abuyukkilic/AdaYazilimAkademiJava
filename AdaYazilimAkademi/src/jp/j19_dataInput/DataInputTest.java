/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j19_dataInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bilsis
 */
public class DataInputTest {

    public static void main(String args[]) {
        String capture;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        try {
            System.out.println("Enter a data:");
            capture = bInput.readLine();
            while (capture != null) {
                System.out.println("Data entered:" + capture);
                capture = bInput.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
