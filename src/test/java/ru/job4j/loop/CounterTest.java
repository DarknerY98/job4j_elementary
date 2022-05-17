package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom2To14Then56() {
        int start = 2;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom14To24Then114() {
        int start = 14;
        int finish = 24;
        int result = Counter.sumByEven(start, finish);
        int expected = 114;
        Assert.assertEquals(expected, result);
    }
}