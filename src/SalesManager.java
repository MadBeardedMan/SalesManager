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
    public int cutAverage () {
        int max = sales[0];
        int min = sales[0];
        int average = 0;
        for (int sale : sales) {
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