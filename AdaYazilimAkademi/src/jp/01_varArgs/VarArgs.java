/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_01_varArgs;

/**
 *
 * @author bilsis
 */
public class VarArgs {
    //Değişken sayısını bilmediğimiz durumlarda işe yarar
    public static void main(String[] args) {

        printNumbers(15, 20, 3, 61, 75, 18, 10);
        printNumbersForEach(15, 20, 3, 61, 75, 18, 10);
        printManyArguments("Ada", true, 15, 20, 14);
    }

    
    public static void printNumbers(int... numbers) {
        
        int element;
        System.out.println("Eleman Sayısı:" + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            element = numbers[i];
            System.out.println("Sayı: " + element);
        }
    }

    public static void printNumbersForEach(int... numbers) {
        System.out.println("Elemen Sayısı: " + numbers.length);

        for (int number : numbers) {
            System.out.println("Sayı: " + number);
        }
    }

    public static void printManyArguments(String name, boolean valid, int... numbers) {
        System.out.println("Ad: " + name);
        System.out.println("Geçerlilik: " + valid);
        
        
        for (int number : numbers) {
            System.out.println("Sayı: " + number);
        }
    }
}
