package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome1Test {

    @Test
    public void checkPalindrome() {
        Palindrome1 p = new Palindrome1();
        assertEquals(true,p.checkPalindrome(1221));
        assertEquals(false,p.checkPalindrome(122));
    }

    @Test
    public void isGreaterThan25() {
        Palindrome1 p1 = new Palindrome1();
        assertEquals(true,p1.isGreaterThan25(2468642));
        assertEquals(false,p1.isGreaterThan25(24642));    }

    }
