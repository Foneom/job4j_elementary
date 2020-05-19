package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double result = point2.distance(point1);
      Assert.assertEquals(2.83, result, 0.01);
    }
}