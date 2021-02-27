package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainIfLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testRemainIfEqual1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testRemainIfMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }
}