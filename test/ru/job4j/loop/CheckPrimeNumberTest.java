package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void check3IsPrime() {
        boolean rsl = CheckPrimeNumber.check(3);
        assertThat(rsl, is(true));
    }
}