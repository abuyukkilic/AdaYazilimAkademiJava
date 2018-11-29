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
public abstract class GeometricFigure {

    protected String figureType;

    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }

    public abstract void draw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "Figure type: " + this.figureType;
    }

}
