package DSA1;

import java.util.Stack;

public class postfixExpression {

	public static void main(String[] args) {
		String str="12+3*"; //1+2 3* ; 3 3 * ; 3*3 ; 9
		
		System.out.println(evaluatePostfix(str));
	}
	static int evaluatePostfix(String str) {
		Stack<Integer> stack=new Stack<>();
		char[] str1=str.toCharArray();
		for(char s : str1) {
			if(s=='+') {
				int n1=stack.pop();
				int n2=stack.pop();
				stack.push(n1+n2);
			}
			else if(s=='-') {
				int n1=stack.pop();
				int n2=stack.pop();
				stack.push(n1-n2);
			}
			else if(s=='*') {
				int n1=stack.pop();
				int n2=stack.pop();
				stack.push(n1*n2);
			}
			else if(s=='/') {
				int n1=stack.pop();
				int n2=stack.pop();
				stack.push(n1/n2);
			}
			else {
				stack.push(Integer.parseInt(String.valueOf(s)));
			}
		}
		return stack.peek();
		
	}

}
