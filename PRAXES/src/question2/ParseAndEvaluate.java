package question2;

import java.util.Stack;

public class ParseAndEvaluate {
	
	public int parseExpression(String expression) {
		
		Stack<Object> exp = new Stack<Object>();
		
		for(int i = expression.length()-1; i>=0 ;i--) {
			char token = expression.charAt(i);
			
			if(Character.isDigit(token)) {
				exp.push((int)(token - '0'));
			} else if(token != ' ') {
				if(token == '(') {
					int res = evaluate(exp);
					exp.pop();
					exp.push(res);
				} else {
					exp.push(token);
				}
			}
		}
		return evaluate(exp);
	}
	
	public int evaluate(Stack<Object> s) {
		int token = 0;
		if(!s.isEmpty()) {
			if(s.peek() instanceof Integer) {
				token= (int) s.pop();
			} else {
				s.pop();
				token= (int) s.pop();
				token = token * -1;
			}
		}
		while(!s.isEmpty() && !((char)s.peek() == ')')) {
			char opt =  (char) s.pop();
			if(opt == '+') {
				token += (int) s.pop();
			}else {
				token -= (int) s.pop();
			}
		}
		return token;
	}
}
