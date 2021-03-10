package question3;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n= sc.nextInt();
		int stocks[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			stocks[i]= sc.nextInt();
		}
		
		StockProfitCalculation sp = new StockProfitCalculation();
		int profit = sp.calculateProfit(stocks);
		System.out.println("PROFIT : "+profit);
		
		sc.close();
	}

}
