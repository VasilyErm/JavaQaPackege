package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationTest {
    @Test
    public void test1() {
        Vacation service = new Vacation();
        int actual = service.calculate(income: 10_000, expenses: 3_000, threshold: 20_000)
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}