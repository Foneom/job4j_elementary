package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxFirst() {
    MultiMax check = new MultiMax();
    int result = check.max(6, 4, 2);
    assertThat(result, is(6));
    }
    @Test
    public void maxSecond() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void maxThird() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 3, 5);
        assertThat(result, is(5));
    }
    @Test
    public void maxAll() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}