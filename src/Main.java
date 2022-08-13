public class Main {
    public static void main(String[] args) {
        long[] monthlySales = new long[12];
        for (int i=0; i< monthlySales.length; i++) {
            monthlySales[i] = (long)(Math.random()*40);
        }
        SalesManager sale = new SalesManager(monthlySales);
        System.out.println("Наибольшее количество продаж в месяц в текущем году равно: " + sale.max());
    }
}
