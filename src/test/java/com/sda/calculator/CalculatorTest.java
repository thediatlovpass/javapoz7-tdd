package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        this.calculator = new Calculator();
        }

    @Test
    public void testAdd() {
        //when
        int sum = calculator.sum(3, 5);
        //then
        Assert.assertEquals("Result is not 8", 8, sum);
    }

    @Test
    public void testSubtract() {
        //when
        int subtract = calculator.subtract(5, 4);
        //then
        Assert.assertEquals("Result is not 1", 1, subtract);
    }

    @Test
    public void testMultiply() {
        //when
        int multiply = calculator.multiply(5, 5);
        //then
        Assert.assertEquals("Result is not 25", 25, multiply);
    }

    @Test
    public void testDivide() {
        //when
        int divide = calculator.divide(10, 2);
        //then
        Assert.assertEquals("Result is not 5", 5, divide);
    }
}