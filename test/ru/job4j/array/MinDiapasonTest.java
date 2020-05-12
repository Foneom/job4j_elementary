package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
@Test
    public void firstMin(){
    assertThat(
            MinDiapason.findMin(
                    new int[] {-1, 0, 5, 10},
                    1,3
            ),
            is(0)
    );
}

    @Test
    public void secondMin(){
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 5, 2, 10},
                        1,3
                ),
                is(2)
        );
    }
    @Test
    public void thirdMin(){
        assertThat(
                MinDiapason.findMin(
                        new int[] {5, 1, 4, 2},
                        0,4
                ),
                is(1)
        );
    }
}