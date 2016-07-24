package com.hometask11.junit;

import com.hometask.module11.module4.geometricfigures.Circle;
import com.hometask.module11.module4.geometricfigures.Rectangle;
import com.hometask.module11.module4.geometricfigures.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class GeometricFigureTest {
    public static final double DELTA = 1e-15;
    @Test
    public void areaOfCircleTest() {
        final Circle circle = new Circle();
        circle.setRadius(4);
        final double result = circle.areaOfFigure();
        final double expected = 50.26548245743669;

        Assert.assertEquals(expected, result,DELTA);

    }

    @Test
    public void areaOfTriangleTest() {
        final Triangle triangle = new Triangle();
        triangle.setCoreOfTriangle(5);
        triangle.setHeight(7);
        final double result = triangle.areaOfFigure();
        final double expected = 17.5;

        Assert.assertEquals(expected, result,DELTA);

    }
    @Test
    public void areaOfRectangleTest() {
        final Rectangle rectangle= new Rectangle();
        rectangle.setLengthOfFirstSide(15);
        rectangle.setLengthOfSecondSide(23);
        final double result = rectangle.areaOfFigure();
        final double expected = 345;

        Assert.assertEquals(expected, result,DELTA);

    }

}
