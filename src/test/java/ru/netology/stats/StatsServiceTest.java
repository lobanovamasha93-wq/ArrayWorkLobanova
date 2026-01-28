package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    private final StatsService service = new StatsService();

    @Test
    void testCalculateSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(180, service.calculateSum(sales));
    }

    @Test
    void testFindMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(8, service.findMaxMonth(sales));
    }

    @Test
    void testCalculateAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15.0, service.calculateAverage(sales));
    }

    @Test
    void testFindMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, service.findMinMonth(sales));
    }

    @Test
    void testCountMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.countMonthsBelowAverage(sales));
    }

    @Test
    void testCountMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(6, service.countMonthsAboveAverage(sales));
    }
}
