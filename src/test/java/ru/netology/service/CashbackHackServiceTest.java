package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService bonusService = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn100IfAmount900() {
        int amount = 900;

        int actual = bonusService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn0IfAmount1000() {
        int amount = 1000;

        int actual = bonusService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn500IfAmount500() {
        int amount = 500;

        int actual = bonusService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn1000IfAmount0() {
        int amount = 0;

        int actual = bonusService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}