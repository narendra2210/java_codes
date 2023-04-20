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
