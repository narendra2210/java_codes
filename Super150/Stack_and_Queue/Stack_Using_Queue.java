package Super150.Stack_and_Queue;
import Super150.Stack_and_Queue.queue;
public class Stack_Using_Queue {

    // 1 - [O(n)=>pop , O(1)=>push]  , 2 - [O(n)=>push , O(1)=>pop]
        private queue dq = new queue();
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public int size(){
            return dq.size();
        }

        public void push(int item)throws Exception{
            dq.Enqueue(item);
        }

        public int pop()throws Exception{
            queue hlp = new queue();
            while(dq.size()>1){
                hlp.Enqueue(dq.Dequeue());
            }
            int x=dq.Dequeue();
            while(hlp.size()>0){
                dq.Enqueue(hlp.Dequeue());
            }
            return x;
        }
        public int peek()throws Exception{
            queue hlp = new queue();
            while(dq.size()>1){
                hlp.Enqueue(dq.Dequeue());
            }
            int x=dq.Dequeue();
            while(hlp.size()>0){
                dq.Enqueue(hlp.Dequeue());
            }
            return x;

        }
        public static void main(String[] args)throws Exception {
            Stack_Using_Queue st =new Stack_Using_Queue();
            Stack1 s =new Stack1();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            // System.out.println(s.st.display());
            System.out.println(st.peek());
        }
    }
