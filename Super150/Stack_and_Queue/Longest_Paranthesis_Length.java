package Super150.Stack_and_Queue;
import java.util.*;
public class Longest_Paranthesis_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> monu = new Stack<>();
        Stack<Integer> thakur = new Stack<>();
        thakur.push(-1);
        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                monu.push('(');
                thakur.push(i);
            } 
            else {
                if(!monu.isEmpty() && monu.peek() == '(') {
                    monu.pop();
                    thakur.pop();
                    answer = Math.max(answer , (i - thakur.peek()));
                } 
                else {
                    thakur.push(i);
                }
            }
        }
        System.out.println(answer);
    }
}