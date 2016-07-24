package com.hometask.module11.module4.distancebetweenpoints;

public class Coordinate {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Coordinate(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.y2 = y2;
        this.y1 = y1;
        this.x2 = x2;
    }

    public double toCalculateDistance() {
      return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
}
