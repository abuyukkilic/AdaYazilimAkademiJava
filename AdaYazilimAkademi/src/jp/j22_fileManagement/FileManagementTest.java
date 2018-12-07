/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j22_fileManagement;

/**
 *
 * @author bilsis
 */
import static jp.j22_fileManagement.Files.*;

public class FileManagementTest {
    //Note: The folder on which you are going to work must already be created
//And if necessary write permissions must be assigned to the folder

    private static final String FILE_NAME = "c:\\javaTest\\javaFile.txt";

    public static void main(String[] args) {
//Create a file
        createFile(FILE_NAME);
//Write to a file
        writeFile(FILE_NAME, "This is the new content");
//Read from a file
        readFile(FILE_NAME);
//Append to a file
        appendFile(FILE_NAME, "Appending information to the file");
//Leer de un archivo
        readFile(FILE_NAME);
    }

}
