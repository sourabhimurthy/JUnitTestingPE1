package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    @Test
    public void checkEvenOrOdd() {
        TomJerry t1=new TomJerry();
        assertEquals("Jerry",t1.checkEvenOrOdd(22));
    }

    @Test
    public void checkEvenOrOdd1() {
        TomJerry t1=new TomJerry();
        assertEquals("Tom",t1.checkEvenOrOdd(25));
    }

    @Test
    public void checkEvenOrOdd2() {
        TomJerry t1=new TomJerry();
        assertEquals("neither",t1.checkEvenOrOdd(35));
    }
}