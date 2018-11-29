/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j10_objectConversion;

/**
 *
 * @author bilsis
 */
public enum WritingType {
    CLASSIC("Writing by hand"),
    MODERN("Digital writing");

    private final String description;

    private WritingType(String description) {
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
