package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void checkTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void checkFalseAndTrue() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void checkFalse() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void checkFalse1() {
        boolean[] input = new boolean[] {true, true, false};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}