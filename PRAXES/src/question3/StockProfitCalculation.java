package question3;

public class StockProfitCalculation {
	
	public int calculateProfit(int []stocks) {
		int n = stocks.length, diff =0, profit =0;
		if(n==0 || n==1) {
			return 0;
		}
		int minStock = stocks[0];
		for(int i=0;i<n;i++) {
			if(minStock > stocks[i]) {
				minStock = stocks[i];
			}
			diff = stocks[i]-minStock;
			if(diff > profit) {
				profit = diff;
			}
		}
		return profit;
	}
}
