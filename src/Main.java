public class Main {
    public static void main(String[] args) {
        int[] monthlySales = new int[12];
        for (int i=0; i< monthlySales.length; i++) {
            monthlySales[i] = (int)(Math.random()*40);
        }
        SalesManager sale = new SalesManager(monthlySales);
        System.out.println("Наибольшее количество продаж в месяц в текущем году равно: " + sale.max());
    }
}
