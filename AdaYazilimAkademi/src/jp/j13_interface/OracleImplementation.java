/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j13_interface;

/**
 *
 * @author bilsis
 */
public class OracleImplementation implements DataAccess {

    @Override
    public void insert() {
        System.out.println("Insert from Oracle");
    }

    @Override
    public void list() {
        System.out.println("List from Oracle");
    }
}
