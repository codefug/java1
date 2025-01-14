public class AccountingMethodApp {
    public static double value_of_supply;
    private static double vatRate;
    private static double expenseRate;

    public static void main(String[] args){
        value_of_supply=10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
    }

    private static void print() {
        System.out.println("Value of supply : "+ value_of_supply);
        System.out.println("VAT : "+ getVat());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend : "+ getDividend1());
        System.out.println("Dividend : "+ getDividend2());
        System.out.println("Dividend : "+ getDividend3());
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }

    private static double getDividend2() {
        return getIncome() * 0.3;
    }

    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getExpense() {
        return value_of_supply * expenseRate;
    }


    private static double getIncome() {
        return value_of_supply - value_of_supply * expenseRate;
    }

    private static double getTotal() {
        return value_of_supply + getVat();
    }

    private static double getVat() {
        return value_of_supply * vatRate;
    }
}