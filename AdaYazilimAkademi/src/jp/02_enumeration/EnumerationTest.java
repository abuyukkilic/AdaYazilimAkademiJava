/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_02_enumeration;

/**
 *
 * @author bilsis
 */
public class EnumerationTest {

    public static void main(String[] args) {
// Enum Değeri
        System.out.println("1:" + Days.MONDAY);
// Enum Değerini Fonksiyonda Kullanılması
        indicateDay(Days.MONDAY);
// Kıta Listesi
        System.out.println("4.Kıta:" + Continents.AMERICA);
        System.out.println("Amerikadaki ülke sayısı:" + Continents.AMERICA.getCountries());
 //Kıtalardaki ülke sayıları
        System.out.println("");
        indicateCountries(Continents.AFRICA);
//Tüm kıtalardaki öğrenci Sayıları
        System.out.println("");
        printContinents();
    }

    public static void indicateDay(Days days) {
        switch (days) {
//Enumları fonksiyonda direk kullanmak
            case MONDAY:
                System.out.println("Haftanın ilk günü");
                break;
            case TUESDAY:
                System.out.println("Haftanın ikinci günü");
                break;
            default:
                System.out.println("Haftanın diğer günleri");
        }
    }

    public static void indicateCountries(Continents continents) {
        switch (continents) {
            case AFRICA:
                System.out.println("No. Countries in: " + continents + ": " + continents.getCountries());
                break;
            default:
                System.out.println("And so we continue with the other continents");
        }
    }

    public static void printContinents() {
        for (Continents c : Continents.values()) {
            System.out.println("Continent: " + c + " contains " + c.getCountries() + " countries.");
        }
    }

}
