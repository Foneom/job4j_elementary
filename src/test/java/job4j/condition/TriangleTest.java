package job4j.condition;

import org.junit.Assert;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenTriangleExistAreaTest() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 1);
        Point c = new Point(5, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 6;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.01);

    }
}