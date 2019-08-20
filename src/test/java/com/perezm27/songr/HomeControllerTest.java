package com.perezm27.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void reverseWords() {
        String test = "hello world";
        System.out.println(test);

        assertEquals("world hello", HomeController.reverseWords(test));
    }
}