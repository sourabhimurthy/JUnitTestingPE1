package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public  void test(String st) {
        String expected = st.toUpperCase();
        assertEquals(expected,st);
    }

}