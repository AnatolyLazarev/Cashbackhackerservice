package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class Cashbackhackerservicetest {
    @Test
    public void shouldCalcCashBack() {
        Cashbackhackerservice service = new Cashbackhackerservice();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfOver() {
        Cashbackhackerservice service = new Cashbackhackerservice();
        int amount = 1300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfUnder() {
        Cashbackhackerservice service = new Cashbackhackerservice();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}