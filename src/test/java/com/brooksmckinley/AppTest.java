/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testPassword() {
        Assertions.assertTrue(App.correctPassword("abc$123"));
        Assertions.assertFalse(App.correctPassword("ABC$123"));
        Assertions.assertFalse(App.correctPassword("12345"));
        Assertions.assertFalse(App.correctPassword("123123"));
    }
}