package com.hometask.module11.module4.geometricfigures;

public class Circle extends GeometricFigure {

    private double radius;
    public final static double PI = Math.PI;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getClassName() {
        return "Circle";
    }

    @Override
    public String initParam() {
        return "Please enter radius: ";
    }

    @Override
    public double areaOfFigure() {
        return PI * radius * radius;
    }
}
