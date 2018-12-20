package com.stackroute.unittest.PE1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyEleTest {

    @Test
    public void identifyele() {
        IdentifyEle e1=new IdentifyEle();

        assertEquals("Small letter",e1.identifyele('a'));

    }

    @Test
    public void identifyele1() {
        IdentifyEle e2=new IdentifyEle();

        assertEquals("Capital letter",e2.identifyele('A'));

    }

    @Test
    public void identifyele2() {

        IdentifyEle e3=new IdentifyEle();

        assertEquals("Number",e3.identifyele('1'));

    }

    @Test
    public void identifyele3() {
        IdentifyEle e4=new IdentifyEle();

        assertEquals("Special character",e4.identifyele('@'));

    }
}