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
		Balanced_Paranthesis mainobj = new Balanced_Paranthesis();
		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
		if (isBalanced(str , stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
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

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {

			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}
