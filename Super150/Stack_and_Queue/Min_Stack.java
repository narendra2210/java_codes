// Design a stack that supports push,pop,top,retrieving the minimum element in constant time.

// Input Format
// First line of input contains integer n denoting the size of the string array. 
// Next line of input contains n space separated string where i-th string represent i-th operation.
// (i.e, push,pop,top,getMin)

// Constraints
// Functions pop, top and getMin operations will always be called on non-empty stacks.

// Output Format
// Print the answer according to input operations.

// Sample Input
// 7
// push push push getMin pop top getMin
// -2 0 -3
// Sample Output
// -3 0 -2 
// Explanation
// push -2
// push 0
// push -3
// print -3 (getMin)
// pop -3
// print 0 (top)
// print -2 (getMin)

package Super150.Stack_and_Queue;

import java.util.*;
public class Min_Stack {
    public static void main (String args[]){
       Scanner scn = new Scanner(System.in);
       int size = scn.nextInt();
       String monu[] = new String[size];
       int counter=0;
       for(int i=0;i<size;i++){
           monu[i] = scn.next();
           if(monu[i].equals("push")){
               counter++;
           }
       }
       ArrayList<Integer> array = new ArrayList<>();
       for(int i=0;i<counter;i++){
           array.add(scn.nextInt());
       }
       OPERATION(monu , array);
    }
    public static void OPERATION(String[] monu ,ArrayList<Integer> array){
        int k=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<monu.length;i++){
            if(monu[i].equals("push")){
                stack.push(array.get(k));
                k++;
            }
            else if(monu[i].equals("getMin")){
                System.out.print(getMin(stack)+" ");
            }
            else if(monu[i].equals("pop")){
                stack.pop();
            }
            else if(monu[i].equals("top")){
                System.out.print(stack.peek()+" ");
            }
        }
    }
    public static int getMin(Stack<Integer> st){
        int min_value = st.peek();
        for(Integer i : st){
            min_value=Math.min(min_value,i);
        }
        return min_value;
    }
}
