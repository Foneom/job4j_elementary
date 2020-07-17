package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void when3Param() {
        int result = Max.max(8, 4, 3);
        assertThat(result, is(8));
    }
    @Test
    public void when4Param() {
        int result = Max.max(9, 5, 3, 2);
        assertThat(result, is(9));
    }
}