package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.maxSalesMonth(sales);
        long expected = 7;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAmountMonthsWithSalesUnderAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthsWithUnderAverageSales(sales);
        long expected = 5;
        assertEquals(expected,actual);

    }
    @Test
    public void shouldFindAmountMonthsWithSalesAboveAverage(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthsWithSalesAboveAverage(sales);
        long expected = 5;
        assertEquals(expected,actual);

    }

}