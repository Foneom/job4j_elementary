package job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 4, 3, 2};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap2to0() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] rsl = SwitchArray.swap(input, 2, 0);
        assertThat(rsl, is(expect));
    }
}