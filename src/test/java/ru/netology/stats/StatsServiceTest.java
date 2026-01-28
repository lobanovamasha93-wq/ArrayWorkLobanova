package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private final StatsService service = new StatsService();

    @Test
    void testCalculateSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 2 packed, 7, 14, 14, 18};
        assertEquals(180, service.calculateSum(sales));
    }

    @Test
    void testCalculateAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(15.0, service.calculateAverage(sales));
    }

    @Test
    void testFindMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(8, service.findMaxMonth(sales)); // 8-й месяц (индекс 7)
    }

    @Test
    void testFindMinMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(9, service.findMinMonth(sales)); // 9-й месяц (индекс 8)
    }

    @Test
    void testCountMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(5, service.countMonthsBelowAverage(sales)); // месяцы: 1, 3, 9, 10, 11
    }

    @Test
    void testCountMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        assertEquals(6, service.countMonthsAboveAverage(sales)); // месяцы: 2, 4, 5, 6, 7, 12
    }
}
