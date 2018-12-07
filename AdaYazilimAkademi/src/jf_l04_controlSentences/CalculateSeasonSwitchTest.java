/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jf_l04_controlSentences;

/**
 *
 * @author bilsis
 */
public class CalculateSeasonSwitchTest {

    public static void main(String[] args) {
        int month = 11; // Month of the year
        String season;
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Incorrect Month";
        }
        System.out.println("The season for the month " + month + " is: " + season);
    }

}
