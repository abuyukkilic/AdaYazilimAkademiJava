/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j10_objectConversion;

/**
 *
 * @author bilsis
 */
public class ObjectConversion {

    public static void main(String[] args) {
        Employee employee;
        
        employee = new CopyWriter("Aykut", 1500, WritingType.MODERN);
        printDetails(employee);
    
        
        employee = new Manager("Ada", 1800, "Systems");
        printDetails(employee);

    }

    public static void printDetails(Employee employee) {
        String result = null;
        System.out.println("\nDetails: " + employee.getDetails());

        if (employee instanceof CopyWriter) {
            CopyWriter writer = (CopyWriter) employee;
            result = writer.getWritingTypeInText();

            //Another way is to make the conversion in the same line of code.
            //This is very compun to find in Java
            //to avoid the creation of unnecessary variables    
            result = ((CopyWriter) employee).writingType.getDescription();
            System.out.println("typeWriting result:" + result);
            
        } else if (employee instanceof Manager) {
            //We do the downcasting in the same line of code
            //we saved a variable
            result = ((Manager) employee).getDepartment();
            System.out.println("department result:" + result);
        }

    }
}
