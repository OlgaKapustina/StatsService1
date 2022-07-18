package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long ans = 0;
        for (long sale : sales) {
            ans += sale;

        }
        return ans;
    }

    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }

    public int maxSalesMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = 1;
            }

        }
        return maxi;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsWithUnderAverageSales(long[] sales) {
        long average = sum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;

            }
            return count;
        }
        return count;
    }

    public int monthsWithSalesAboveAverage ( long[] sales){
        long average = sum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;

            }
            return count;
        }
        return count;
    }
}
