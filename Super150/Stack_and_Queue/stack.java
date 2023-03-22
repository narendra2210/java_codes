package Super150.Stack_and_Queue;
import java.util.*;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println(st.size());
    }
}
