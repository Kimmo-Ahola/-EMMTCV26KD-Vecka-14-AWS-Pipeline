package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlwaysTrueTest {
    @Test
    public void testAlwaysTrue() {
        assertTrue(true); // should always be green when using minimum-buildspec.yml
    }
}
