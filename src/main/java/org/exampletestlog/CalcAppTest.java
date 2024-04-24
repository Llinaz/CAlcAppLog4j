package org.exampletestlog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcAppTest {
    private CalcApp calcApp;

    @Test
    public void getSum() {
        assertEquals(14, calcApp.getSum(7,7));
    }

    @Test
    public void getDivide() {
        assertEquals(25, calcApp.getDivide(100, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calcApp.getDivide(15, 0);
    }
    @Test
    public void getMultiple() {
        assertEquals(48, calcApp.getMultiple(6, 8));
    }
    @Test
    public void getSub() {
        assertEquals(12, calcApp.getSub(71, 59));
    }
    @Before
    public void initTest() {
        calcApp = new CalcApp();
    }
    @After
    public void afterTest() {
        calcApp = null;
    }
}
