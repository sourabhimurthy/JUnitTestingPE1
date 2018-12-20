package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackrouteTest {

    @Test
    public void repeatString() {
        Stackroute s1=new Stackroute();
        assertEquals("tete",s1.repeatString("Stackroute",2));
    }

    @Test
    public void repeatString1() {
        Stackroute s1=new Stackroute();
        assertEquals("routerouterouterouteroute",s1.repeatString("Stackroute",5));
    }

    @Test
    public void repeatString2() {
        Stackroute s1=new Stackroute();
        assertEquals("uteuteute",s1.repeatString("Stackroute",3));
    }


}