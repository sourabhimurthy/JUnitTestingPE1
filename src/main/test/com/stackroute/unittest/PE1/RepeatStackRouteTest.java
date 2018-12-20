package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStackRouteTest {
    @Test
    public void repeatString() {
        RepeatStackRoute r = new RepeatStackRoute();
        assertEquals("Stackrouterouterouterouterouteroute", r.repeatString("Stackroute", 5));
    }

    @Test
    public void repeatString1() {
        RepeatStackRoute r = new RepeatStackRoute();
        assertEquals("Stackroutetete", r.repeatString("Stackroute", 2));
    }
}