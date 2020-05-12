package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int rslt = findLoop.indexOff(input, value);
        int expect = 0;
        assertThat(rslt, is(expect));
    }
    @Test
    public void whenArrayHas6then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 6;
        int rslt = findLoop.indexOff(input, value);
        int expect = 0;
        assertThat(rslt, is(expect));
    }

    @Test
    public void findElement(){
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 3;
        int start = 0;
        int finish = 2;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void notFindElement(){
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3, 2, 1, 4};
        int value = 5;
        int start = 1;
        int finish = 5;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}