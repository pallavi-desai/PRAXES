package question1;

import java.util.ArrayList;
import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		ArrayList <String> result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String value");
		String s = sc.nextLine();
		
		System.out.println("Enter the value for K");
		int k = sc.nextInt();
		
		result = new StringWrap().performWrap(s, k);
		System.out.println(result);
		
		sc.close();
	}

}
