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
public interface DataAccess {

    public static int MAX_RECORDS = 10;

    public abstract void insert();

    public abstract void list();

}
