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
public class ExeptionHandlingArg {

    public static void main(String args[]) throws OperationException {
        try {
            int op1 = 10;
            int op2 = 0;
            Division div = new Division(op1, op2);
            div.visualizeOperation();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.print("An error occurred!");
            System.out.println("There was an error accessing an item out of range");
            aie.printStackTrace(System.out);
        } catch (NumberFormatException nfe) {
            System.out.print("An error occurred! ");
            System.out.println("One of the arguments is not an int");
            nfe.printStackTrace(System.out);
        } catch (OperationException oe) {
            System.out.print("An error occurred! ");
            System.out.println("It tried to perform an erroneous operation");
            oe.printStackTrace(System.out);
        } finally {
            System.out.println("The exceptions were reviewed");
        }
    }
}
