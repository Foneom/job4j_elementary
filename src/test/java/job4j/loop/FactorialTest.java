package job4j.loop;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialFive() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }
    @Test
    public void factorialZero() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
    @Test
    public void factorialOne() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}