/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j16_collections;

import java.util.*;

/**
 *
 * @author bilsis
 */
public class CollectionTest {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        //Repeated element
        myList.add("4");
        print(myList);

        Set mySet = new HashSet();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        mySet.add("4");
        //Does not allow repeated elements, ignores it
        mySet.add("4");
        print(mySet);

        Map myMap = new HashMap();
        //Key, value
        myMap.put("1", "John");
        myMap.put("2", "Katty");
        myMap.put("3", "Charly");
        myMap.put("4", "Sara");
      
        myMap.put("4", "Sara");
        // değerin üzerine yazar
        myMap.put("4", "Alara");
        myMap.put("5", "Alara");
        //All the keys are printed
        print(myMap.keySet());
        //All values are printed
        print(myMap.values());
    }

    private static void print(Collection collection) {
        for (Object element : collection) {
            System.out.print(element + " ");
        }
        System.out.println("");

    }
}
