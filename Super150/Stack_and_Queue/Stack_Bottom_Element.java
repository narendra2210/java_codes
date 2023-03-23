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
        Remove_Last_Element(st);
        System.out.println("Stack after Removing last element : " + st);
        Insert_Last_Element(st , 100);
        System.out.println("Stack after Inserting element at last element : " + st);
        Reverse_Stack(st);
        System.out.println("Stack after Reverse : " + st);
    }

    //Last element of the Stack
    public static int Last_Element(Stack<Integer> st){
        if(st.size()==1){
             return st.peek();
        }
        int item = st.pop();
        int x = Last_Element(st);
        st.push(item);
        return x;
    }

    //Removing last element
    public static void Remove_Last_Element(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int item = st.pop();
        Remove_Last_Element(st);
        st.push(item);
    }

    //Inserting
    public static void Insert_Last_Element(Stack<Integer> st , int a){
        if(st.size()==0){
            st.push(a);
            return;
        }
        int item = st.pop();
        Insert_Last_Element(st , a);
        st.push(item);
    }

    //Reverse
    public static void Reverse_Stack(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int item = st.pop();
        Reverse_Stack(st);
        Insert_Last_Element(st, item);
    }
}
