package com.hometask.module11.module4.geometricfigures;

public abstract class GeometricFigure {

    public abstract String getClassName();

    public abstract String initParam();

    public abstract double areaOfFigure();

    @Override
    public String toString() {
        return "Great!!!\nArea of your " + getClassName() + " = " + areaOfFigure() +
                ".\nGood luck, dude!:)";
    }

}
