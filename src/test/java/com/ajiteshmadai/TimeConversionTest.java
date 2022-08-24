package com.ajiteshmadai;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeConversionTest {

    @Test
    public void testTimeConversion() {
        assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
        assertEquals("00:40:22", TimeConversion.timeConversion("12:40:22AM"));
        assertEquals("06:40:03", TimeConversion.timeConversion("06:40:03AM"));

    }
}