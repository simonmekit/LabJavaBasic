package perscholas.java_basic;

public class SalesTaxDemo {
    public static void main(String[] args) {
        float coffee = 2.5f, cappuccino = 3.5f, espresso = 2.5f;
        double subTotal = 0.0, totalSale = 0.0;
        subTotal = 3 * coffee + 4 * cappuccino + 2 * espresso;
        final float SALES_TAX = 0.11f;
        totalSale = subTotal + SALES_TAX;
        System.out.printf("Sales total: %.2f", totalSale);
    }
}
