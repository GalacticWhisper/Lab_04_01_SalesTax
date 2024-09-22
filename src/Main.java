//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double purchasePrice = 36.99;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;
        double finalTotal = purchasePrice + salesTax;
        System.out.printf("The price you paid for your item is " + purchasePrice + ". The tax rate is " + taxRate + ", which means your sales tax is " + salesTax + ". Your final total is " + finalTotal + ".\n");

    }
}