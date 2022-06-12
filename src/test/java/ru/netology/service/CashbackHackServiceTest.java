package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn100IfAmount900() {
        CashbackHackService bonusService = new CashbackHackService();
        int amount = 900;

        int actual = bonusService.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackService bonusService = new CashbackHackService();
        int amount = 1000;

        int actual = bonusService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn500IfAmount500() {
        CashbackHackService bonusService = new CashbackHackService();
        int amount = 500;

        int actual = bonusService.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn1000IfAmount0() {
        CashbackHackService bonusService = new CashbackHackService();
        int amount = 0;

        int actual = bonusService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

}