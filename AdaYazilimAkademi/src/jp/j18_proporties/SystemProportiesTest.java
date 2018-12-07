/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j18_proporties;

/**
 *
 * @author bilsis
 */

import java.util.*;

public class SystemProportiesTest {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Enumeration propertiesEnum = properties.propertyNames();
        while (propertiesEnum.hasMoreElements()) {
            String propertyName = (String) propertiesEnum.nextElement();
            String propertyValue = properties.getProperty(propertyName);
            System.out.println("Key:" + propertyName + ", value=" + propertyValue);
        }
    }

}
