package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void assertFalse() {
        double ab = 2.5;
        double ac = 2.7;
        double bc = 17.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}