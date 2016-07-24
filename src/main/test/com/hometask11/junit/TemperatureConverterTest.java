package com.hometask11.junit;

import com.hometask.module11.module4.temperatureconverter.TemperatureConverter;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {
    public static final double DELTA = 1e-15;
    @Test
    public void inFahrenheitTest() {
        final double degreeCelsius = 36;
        final TemperatureConverter temperatureConverter = new TemperatureConverter();
        final double result = temperatureConverter.inFahrenheit(degreeCelsius);
        final double expected = 96.8;
        Assert.assertEquals(expected,result,DELTA);
    }

    @Test
    public void inCelsiusTest() {
        final double degreeFahrenheit = 243;
        final TemperatureConverter temperatureConverter = new TemperatureConverter();
        final double result = temperatureConverter.inCelsius(degreeFahrenheit);
        final double expected = 117.22222222222221;
        Assert.assertEquals(expected,result,DELTA);

    }

}
