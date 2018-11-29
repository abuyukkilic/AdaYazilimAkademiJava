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
public class InterfacesTest {

    public static void main(String[] args) {
        DataAccess data = null;
        String action = null;

        //Oracle Test
        data = new OracleImplementation();
        action = "list";
        executer(data, action);
        
        
         //Oracle Test
        data = new MySqlImplementation();
        action = "insert";
        executer(data, action);
        
        

    }

    private static void executer(DataAccess data, String action) {
        if ("list".equals(action)) {
            data.list();
        } else if ("insert".equals(action)) {
            data.insert();
        }
    }
}
