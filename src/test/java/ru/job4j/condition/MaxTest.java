package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax3To4Then4() {
        int left = 3;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To5Then5() {
        int first = 5;
        int second = 5;
        int third = 5;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To7To8Then8() {
        int first = 6;
        int second = 7;
        int third = 8;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then5() {
        int first = 1;
        int second = 2;
        int third = 3;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}