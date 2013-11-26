package ru.pilin.jedis.mock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ByteArrayKeyTest {

    @Test
    public void shouldCompareTwoEqualKeys() throws Exception {
        assertEquals(
            new ByteArrayKey(1, 2, 3),
            new ByteArrayKey(1, 2, 3));
    }

    @Test
    public void shouldCompareTwoUnequalKeys() throws Exception {
        assertNotEquals(
            new ByteArrayKey(1, 2, 3),
            new ByteArrayKey(1, 2));
    }

    @Test
    public void shouldCompareTwoEqualHashcodes() throws Exception {
        assertEquals(
            new ByteArrayKey(1, 2, 3).hashCode(),
            new ByteArrayKey(1, 2, 3).hashCode());
    }

    @Test
    public void shouldCompareTwoUnequalHashcodes() throws Exception {
        assertNotEquals(
            new ByteArrayKey(1, 2, 3).hashCode(),
            new ByteArrayKey(1, 2).hashCode());
    }
}
