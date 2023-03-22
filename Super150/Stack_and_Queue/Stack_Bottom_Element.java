package Super150.Stack_and_Queue;
import java.util.*;
public class Stack_Bottom_Element {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Last element of stack : " + Last_Element(st));
    }
    public static int Last_Element(Stack<Integer> st){
        if(st.size()==1){
             return st.peek();
        }
        int item = st.pop();
        int x = Last_Element(st);
        st.push(item);
        return x;
    }
}
