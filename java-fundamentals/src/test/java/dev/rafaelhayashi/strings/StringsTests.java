package dev.rafaelhayashi.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsTests {


    @Test
    void test_substring_string() {
        String name = "Luke Skywalker";
        assertEquals("uke Skywalker", name.substring(1));
        assertEquals("Skywalker", name.substring(5));
        assertEquals("walk", name.substring(8, 12));
    }
}
