/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j02_enumeration;

/**
 *
 * @author bilsis
 */
public enum Continents {
    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
// Attribute of each item in an enumeration
    private final int countries;
// Constructor of each element of the enumeration

    Continents(int countries) {
        this.countries = countries;
    }

    public int getCountries() {
        return countries;
    }

}
