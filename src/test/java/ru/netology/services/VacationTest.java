package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationTest {
    @Test
    public void test1() {
        Vacation service = new Vacation();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}