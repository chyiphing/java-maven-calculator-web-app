package com.qianhong.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

// Unit tests for the CalculatorService class.
public class CalculatorServiceTest {

    // Test the "ping" method of the CalculatorService class.
    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    // Test the "Add" method of the CalculatorService class.
    @Test
    public void testAdd() {
        // Verify that the addition operation returns the expected result.
        assertEquals(34, new CalculatorService().Add(8, 26).getResult());
    }

    // Test the "Sub" method of the CalculatorService class.
    @Test
    public void testSub() {
        // Verify that the subtraction operation returns the expected result.
        assertEquals(4, new CalculatorService().Sub(12, 8).getResult());
    }

    // Test the "Mul" method of the CalculatorService class.
    @Test
    public void testMul() {
        // Verify that the multiplication operation returns the expected result.
        assertEquals(88, new CalculatorService().Mul(11, 8).getResult());
    }

    // Test the "Div" method of the CalculatorService class.
    @Test
    public void testDiv() {
        // Verify that the division operation returns the expected result.
        assertEquals(1, new CalculatorService().Div(12, 12).getResult());
    }
}
