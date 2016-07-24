package com.hometask11.junit;

import com.hometask.module11.module5.Counting;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCountingTest {
    private int[] arrayTest = {1, 765, 345, -76};

    @Test
    public void calculateMaxValueTest() {
        final int result = Counting.calculateMaxValue(arrayTest);
        final int expected = 765;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void calculateMinValueTest() {
        final int result = Counting.calculateMinValue(arrayTest);
        final int expected = -76;
        Assert.assertEquals(expected, result);

    }
}