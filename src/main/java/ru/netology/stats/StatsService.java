package ru.netology.stats;

public class StatsService {

        public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverage(long[] sales) {
        return (double) calculateSum(sales) / sales.length;
    }

    public int findMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // номера месяцев с 1
    }

    public int findMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // номера месяцев с 1
    }

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