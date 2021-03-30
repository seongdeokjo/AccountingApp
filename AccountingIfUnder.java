
public class AccountingIfUnder {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATrate = 0.1;
		double expneseRate =0.3;
		double VAT = valueOfSupply*VATrate;
		double Total = valueOfSupply+VAT;
		double expense = valueOfSupply*expneseRate;
		double income = valueOfSupply-expense;
		double dividend1 = income * 1;
		double dividend2 = income * 0;
		double dividend3 = income * 0;

		System.out.println("Value of supply:" +valueOfSupply);
		System.out.println("VAT:" +VAT);
		System.out.println("Total:" + Total);
		System.out.println("Expense:"+ expense);
		System.out.println("Income:"+ income);
		System.out.println("Dividend 1:" +dividend1 );
		System.out.println("Dividend 2:" +dividend2 );
		System.out.println("Dividend 3:" +dividend3 );
		

	}

}
