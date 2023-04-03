// Implement a Queue using two stacks Make it Dequeue efficient.

// Input Format
// Enter the size of the queue N add 0 - N-1 numbers in the queue

// Constraints
// Output Format
// Display the numbers in the order they are dequeued and in a space separated manner

// Sample Input
// 5
// Sample Output
// 0 1 2 3 4

package Super150.Stack_and_Queue;
import java.util.*;

public class Queue_Using_Stack {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn =new Scanner(System.in);
        int number =scn.nextInt();
		Queue monu = new Queue(); 
		for(int i=0;i<number;i++){
            monu.enQueue(i);
		}
		for(int i=0;i<number;i++){
			System.out.print(monu.deQueue() + " ");
		}
    }
	static class Queue{
        static Stack<Integer> s1 = new Stack<Integer>(); 
        static Stack<Integer> s2 = new Stack<Integer>(); 
        public static void enQueue(int x) { 
            while (!s1.isEmpty()){ 
                s2.push(s1.pop()); 
		    }
            s1.push(x); 
            while (!s2.isEmpty()) { 
                s1.push(s2.pop()); 
            } 
        }  
        public static int deQueue() {  
            if (s1.isEmpty()) { 
                System.out.println("Q is Empty"); 
                System.exit(0); 
            } 
            int x = s1.peek(); 
            s1.pop(); 
            return x; 
        } 
	}
}
