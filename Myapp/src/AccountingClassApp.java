class Accounting{
    public static double value_of_supply;
    public static double vatRate;
    public static double expenseRate;
    public static void print() {
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
//class Accounting2{
//    public static double value_of_supply;
//    public static double vatRate;
//    public static double expenseRate;
//    public static void print() {
//        System.out.println("Value of supply : "+ value_of_supply);
//        System.out.println("VAT : "+ getVat());
//        System.out.println("Total : "+ getTotal());
//        System.out.println("Expense : "+ getExpense());
//        System.out.println("Income : "+ getIncome());
//        System.out.println("Dividend : "+ getDividend1());
//        System.out.println("Dividend : "+ getDividend2());
//        System.out.println("Dividend : "+ getDividend3());
//    }
//
//    private static double getDividend1() {
//        return getIncome() * 0.5;
//    }
//
//    private static double getDividend2() {
//        return getIncome() * 0.3;
//    }
//
//    private static double getDividend3() {
//        return getIncome() * 0.2;
//    }
//
//    private static double getExpense() {
//        return value_of_supply * expenseRate;
//    }
//
//    private static double getIncome() {
//        return value_of_supply - value_of_supply * expenseRate;
//    }
//
//    private static double getTotal() {
//        return value_of_supply + getVat();
//    }
//
//    private static double getVat() {
//        return value_of_supply * vatRate;
//    }
//}
public class AccountingClassApp {

    public static void main(String[] args){
//        Accounting.value_of_supply=10000.0;
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        //...
//        Accounting.print();
//        //...
//        Accounting.value_of_supplu=20000.0;
//        Accounting.vatRate=0.1;
//        Accounting.expenseRate=0.3;
//        Accounting.print();
//        // anotherVariable = ...;
//        // anotherMethod= ...;
//        Accounting1.value_of_supply=10000.0;
//        Accounting1.vatRate = 0.1;
//        Accounting1.expenseRate = 0.3;
//        //...
//        Accounting1.print();
//        //...
//        Accounting2.value_of_supply=20000.0;
//        Accounting2.vatRate=0.1;
//        Accounting2.expenseRate=0.3;
//        Accounting2.print();
//        // anotherVariable = ...;
//        // anotherMethod= ...;

        // instance new를 붙혀서 생긴 복제 class를 instance
        Accounting a1=new Accounting();
        a1.value_of_supply=10000.0;
        a1.vatRate=0.1;
        a1.expenseRate=0.3;

        Accounting a2=new Accounting();
        a2.value_of_supply=20000.0;
        a2.vatRate=0.05;
        a2.expenseRate=0.2;

        a1.print();
        a2.print();
    }
}