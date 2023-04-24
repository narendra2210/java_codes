// Monu bhaiya loves to play with parenthesis.He decides to play a game.

// How long can a balanced expression be? For example, given a string containing
//  only opening and closing parentheses, what is the maximum length of a well-formed 
//  parentheses substring? In other words, how many consecutive parentheses can be properly
//   matched and closed within the string?

// Given a string containing just the characters '(' and ')', print the length of the 
// longest valid (well-formed) parentheses substring

// Input Format
// First Line:It consists of a string with "(" or ")"

// Constraints
// 0 <= s.length <= 3 * 10^4
// s[i] is '(', or ')'.

// Output Format
// It prints the longest valid well formed substring.

// Sample Input
// (()
// Sample Output
// 2
// Explanation
// The longest valid parentheses substring is "()".

package Super150.Stack_and_Queue;
import java.util.*;
public class Longest_Balanced_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int len = s.length();
        int arr[] = new int[len];
        int counter = 0;
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                   int temp = st.pop();
                   arr[temp] = 1;
                   arr[i] = 1;
                }
            }
        }
        for(int i = 0; i<len ; i++){
            if(arr[i] == 1){
                counter++;
            }
            else{
                max = Math.max(max , counter);
                counter = 0;
            }
        }
        max = Math.max(max , counter);
        return max;
    }
}
