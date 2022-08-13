public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long cutAverage () {
        long max = sales[0];
        long min = sales[0];
        long average = 0;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
            average = average + sale;
        }
        return (average - min - max) / (sales.length - 2);
    }
}