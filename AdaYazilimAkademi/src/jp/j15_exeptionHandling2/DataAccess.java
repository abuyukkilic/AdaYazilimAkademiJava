/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j15_exeptionHandling2;

/**
 *
 * @author bilsis
 */
public interface DataAccess {

    public abstract void insert() throws DataAccessEx;

    public abstract void list() throws DataAccessEx;

    public abstract void simulateError(boolean simularError);

}
