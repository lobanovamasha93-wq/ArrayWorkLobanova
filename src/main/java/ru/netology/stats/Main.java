package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long sum = service.calculateSum(sales);
        double average = service.calculateAverage(sales);
        int maxMonth = service.findMaxMonth(sales);
        int minMonth = service.findMinMonth(sales);
        int monthsBelowAvg = service.countMonthsBelowAverage(sales);
        int monthsAboveAvg = service.countMonthsAboveAverage(sales);

        System.out.println("Сумма всех продаж: " + sum);
        System.out.println("Средняя сумма продаж в месяц: " + average);
        System.out.println("Номер месяца с пиком продаж: " + maxMonth);
        System.out.println("Номер месяца с минимумом продаж: " + minMonth);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthsBelowAvg);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthsAboveAvg);
    }
}