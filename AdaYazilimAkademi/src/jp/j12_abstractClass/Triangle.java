/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.j12_abstractClass;

/**
 *
 * @author bilsis
 */
public class Triangle extends GeometricFigure {

    public Triangle(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
//Implementation of the inherit drawing method of the GeometricFigure class
        System.out.println("Here it should draw a:" + this.getClass().getSimpleName());
    }
}
