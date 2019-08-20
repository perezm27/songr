package com.perezm27.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void reverseWords() {
        String test = "hello world";
        assertEquals("world hello", HomeController.reverseWords(test));

        String test2 = "Hi how are you";
        assertEquals("you are how Hi", HomeController.reverseWords(test2));


    }
}