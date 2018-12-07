/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j17_genericClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bilsis
 */
public class GenericCollectionTest {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("4");
        print(myList);

        Set<String> mySet = new HashSet<>();
        mySet.add("100");
        mySet.add("200");
        mySet.add("300");
        mySet.add("300");
        print(mySet);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("1", "John");
        myMap.put("2", "Charly");
        myMap.put("3", "Katty");
        myMap.put("4", "Sara");
        print(myMap.keySet());
        print(myMap.values());

    }

    static void print(Collection<String> col) {
        for (String element : col) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
