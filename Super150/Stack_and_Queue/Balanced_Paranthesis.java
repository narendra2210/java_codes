// You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to 
// check whether the sequence of parenthesis is balanced or not.
// For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

// Input Format
// A string of '(' , ')' , '{' , '}' and '[' , ']' .

// Constraints
// 1<=|S|<=10^5

// Output Format
// Print "Yes" if the brackets are balanced and "No" if not balanced.

// Sample Input
// (())
// Sample Output
// Yes
// Explanation
// (()) is a balanced string.

package Super150.Stack_and_Queue;

import java.util.*;
public class Balanced_Paranthesis {

	public static void main(String[] args) throws Exception {
	
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Stack<Character> stack = new Stack<>();
		if (isBalanced(str , stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str, Stack<Character> stack) throws Exception {
        int len = str.length();
		if(len % 2 !=0){
			return false;
		}
	    for (int i=0;i<len;i++){
			char ch=str.charAt(i);
            if(ch == '('){
				stack.push(')');
			}
			else if(ch == '{'){
				stack.push('}');
			}
			else if(ch == '['){
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != ch){
				return false;
			}
		}
		return stack.isEmpty();
	}
}
