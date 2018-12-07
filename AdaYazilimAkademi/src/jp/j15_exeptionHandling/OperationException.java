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
public class OperationException extends Exception {

    public OperationException(String message) {
        //Initialize the error message of the parent class
        super(message);
    }

}
