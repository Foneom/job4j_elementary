package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {
@Test
    public void whenSort() {
    int[] input = new int[] {4, 3, 1, 2, 5};
    int[] result = SortSelected.sort(input);
    int[] expect = new int[] {1, 2, 3, 4, 5};
    assertThat(result, is(expect));
}
    @Test
    public void whenSort1() {
        int[] input = new int[] {4, 3, 1, 2, 5, 7, 6, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expect));
    }
}