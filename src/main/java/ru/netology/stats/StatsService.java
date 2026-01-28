package ru.netology.stats;

public class StatsService {

    /**
     * Рассчитывает сумму всех продаж.
     */
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    /**
     * Рассчитывает среднюю сумму продаж в месяц.
     */
    public double calculateAverage(long[] sales) {
        return (double) calculateSum(sales) / sales.length;
    }

    /**
     * Находит номер месяца с пиком продаж (последний по порядку при повторах).
     */
    public int findMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // номера месяцев с 1
    }

    /**
     * Находит номер месяца с минимумом продаж (последний по порядку при повторах).
     */
    public int findMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // номера месяцев с 1
    }

    /**
     * Считает количество месяцев, где продажи ниже среднего.
     */
    public int countMonthsBelowAverage(long[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    /**
     * Считает количество месяцев, где продажи выше среднего.
     */
    public int countMonthsAboveAverage(long[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
