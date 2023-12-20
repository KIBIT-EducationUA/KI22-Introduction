package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestUtilsTest {

    @Test
    public void test1() {
        assertTrue(TestUtils.plus(1, 1) == 2);
    }
}