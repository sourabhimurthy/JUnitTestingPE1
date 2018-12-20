package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddnumberTest {

    @Test
    public void sumOfNumber() {
        Addnumber a1=new Addnumber();
        assertEquals(39,a1.sumOfNumber("12 13 14"));
    }

    @Test
    public void sumOfNumber1() {
        Addnumber a1=new Addnumber();
        assertEquals(9,a1.sumOfNumber("2 3 4"));
    }

    @Test
    public void sumOfNumber2() {
        Addnumber a1=new Addnumber();
        assertEquals(30,a1.sumOfNumber("20 6 4"));
    }
}