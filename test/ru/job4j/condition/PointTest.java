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
        double result = point1.distance(point2);
      Assert.assertEquals(2.0, result, 0.01);
    }
    @Test
    public void testDistance3d() {
        Point point1 = new Point(1, 1, 2);
        Point point2 = new Point(2, 2, 4);
        double result = point1.distance3d(point2);
        Assert.assertEquals(2.44, result, 0.01);
        }
    }
