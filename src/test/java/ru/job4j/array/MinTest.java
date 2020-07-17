package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }
    @Test
    public void whenSecondMin() {
        assertThat(
                Min.findMin(
                        new int[] {4, 1, 5}
                ),
                is(1)
        );
    }
    @Test
    public void whenThirdMin() {
        assertThat(
                Min.findMin(
                        new int[] {4, 7, 1}
                ),
                is(1)
        );
    }
}