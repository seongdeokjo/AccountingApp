
public class AccountingArrayRoof{

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double VATrate = 0.1;
		double expneseRate =0.3;
		double VAT = valueOfSupply*VATrate;
		double Total = valueOfSupply+VAT;
		double expense = valueOfSupply*expneseRate;
		double income = valueOfSupply-expense;
		
		System.out.println("Value of supply:" +valueOfSupply);
		System.out.println("VAT:" +VAT);
		System.out.println("Total:" + Total);
		System.out.println("Expense:"+ expense);
		System.out.println("Income:"+ income);
	
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		int i = 0;
		while(i<dividendRates.length) {
		System.out.println("Dividend:" +income*dividendRates[i] );
		i = i + 1;
		}

	}
}