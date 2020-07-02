package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount0() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount900() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }
}