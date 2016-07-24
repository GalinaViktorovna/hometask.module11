package com.hometask11.junit;

import com.hometask.module11.module4.distancebetweenpoints.Coordinate;
import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

    public static final double DELTA = 1e-15;
    @Test
    public void toCalculateDistanceTest() throws Exception {
        final double x1 = 3;
        final double x2 = 2;
        final double y1 = 2;
        final double y2 = 4;
        final Coordinate coordinate = new Coordinate(x1, x2, y1, y2);
        final double result = coordinate.toCalculateDistance();
        final double expected = 2.23606797749979;
        Assert.assertEquals(expected, result, DELTA);
    }

}
