package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {

    @Test
    public void shouldAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount0() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount900() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }
}