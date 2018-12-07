/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j22_fileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author bilsis
 */
public class Files {

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            //Create the directory if not exist
            new File("C:\\javaTest").mkdir();
            //Create the file
            PrintWriter output = new PrintWriter(new FileWriter(file));
            //We close the writer in order to finish the file creation
            output.close();
            System.out.println("The file has been created correctly\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void writeFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            try (PrintWriter output = new PrintWriter(new FileWriter(file))) {
                output.println(content);
                output.println();
                output.println("End of writing");
            }
            System.out.println("The file has been written correctly\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        try {
            try (BufferedReader input = new BufferedReader(new FileReader(file))) {
                String reading;
                reading = input.readLine();
                while (reading != null) {
                    System.out.println("Reading: " + reading);
                    reading = input.readLine();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void appendFile(String fileName, String content) {
        File file = new File(fileName);
        try {
            try (PrintWriter output = new PrintWriter(new FileWriter(file, true))) {
                output.println(content);
                output.println();
                output.println("End of append");
            }
            System.out.println("The information has been appended correctly\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
