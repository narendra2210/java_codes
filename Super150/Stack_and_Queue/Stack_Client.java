package Super150.Stack_and_Queue;

public class Stack_Client {
    public static void main(String[] args) throws Exception{
        Stack1 st =new Stack1();
        st.Push(5);
        System.out.println(st.isEmpty());;
        System.out.println(st.isFull());;
        System.out.println(st.size());
        System.out.println(st.peek());
        st.Display();
        System.out.println(st.pop());;
        System.out.println(st.size());
    }
}
