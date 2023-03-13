public class AccountingApp {

    public static void main(String[] args){
        double value_of_supply = Double.parseDouble(args[0]);
        double vat = value_of_supply * 0.1;
        double total = value_of_supply + vat;
        double expenseRate = 0.3;
        double income = value_of_supply - value_of_supply * expenseRate;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;
        double expense = value_of_supply * expenseRate;

        System.out.println("Value of supply : "+ value_of_supply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend : "+ dividend1);
        System.out.println("Dividend : "+ dividend2);
        System.out.println("Dividend : "+ dividend3);
    }
}