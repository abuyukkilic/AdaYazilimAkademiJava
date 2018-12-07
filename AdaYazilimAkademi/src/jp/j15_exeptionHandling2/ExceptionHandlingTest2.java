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
public class ExceptionHandlingTest2 {

    public static void main(String[] args) {
        DataAccess data = new MySqlImplementation();
//Change the state to simulateError = true to test this value
        data.simulateError(true);
        execute(data, "list");
//Change the state to simulateError = false to test this value
        data.simulateError(true);
        System.out.println("");
        execute(data, "insert");
    }

    private static void execute(DataAccess data, String action) {
        if ("list".equals(action)) {
            try {
                data.list();
            } 
            catch (ReadDataAccessEx ex) {
                System.out.println("Read error: Process the most specific exception of data reading");
            } catch (DataAccessEx ex) {
                System.out.println("Data Access Error: Process the most generic exception of access to data");
            } catch (Exception ex) {
                System.out.println("General error");
            } finally {
                System.out.println("Process finally is optional, it will always run regardless of whether there wasan error or not");
            }
        } else if ("insert".equals(action)) {
            try {
                data.insert();
            } catch (DataAccessEx ex) {
                System.out.println("Data access error: We can process only the most generic exception");
            } finally {
                System.out.println("Process finally is optional, it will always run regardless of whether there wasan error or not");
            }
        } else {
            System.out.println("No known action was provided");
        }
    }

}
