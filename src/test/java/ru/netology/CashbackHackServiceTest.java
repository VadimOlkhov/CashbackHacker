package ru.netology;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainIfLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfEqual1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }
}