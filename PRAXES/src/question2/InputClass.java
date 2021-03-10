package question2;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the expression for evaluation");
		String expression = sc.nextLine();
		
		int result  = new ParseAndEvaluate().parseExpression(expression);
		System.out.println("RESULT : "+result);
		
		sc.close();
	}

}
