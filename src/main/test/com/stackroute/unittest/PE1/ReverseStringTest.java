package com.stackroute.unittest.PE1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {



    @Test
    public void reversestring() {
        ReverseString r1=new ReverseString();
        assertEquals(" emoh",r1.Reversestring("home"));
    }

    @Test
    public void reversestring1() {
        ReverseString r2=new ReverseString();
        assertEquals(" olleh",r2.Reversestring("hello"));
    }
}