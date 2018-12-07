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
public class MySqlImplementation implements DataAccess {

    private boolean simulateError;

    @Override
    public void insert() throws DataAccessEx {
        if (simulateError) {
            throw new WriteDataAccessEx("Data writing error");
        } else {
            System.out.println("Insert from MySql");
        }
    }

    @Override
    public void list() throws DataAccessEx {
        if (simulateError) {
            throw new ReadDataAccessEx("Data reading error");
        } else {
            System.out.println("List from MySql");
        }
    }

    public boolean isSimulateError() {
        return simulateError;
    }

    @Override
    public void simulateError(boolean simularError) {
        this.simulateError = simularError;
    }
}
