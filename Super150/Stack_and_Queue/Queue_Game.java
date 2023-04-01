// The Game is as follows You have given a binary array, where 1 denotes push operation and 0 denotes a pop operation in a queue. The task is to check if the possible set of operations are valid or not.
// Print Valid if the set of Operations are Valid Otherwise Print Invalid.

// Input Format
// The First Line contains an Integer T, as the number of Test cases.
// The Next Line contains an Integer N, as the Size of the Array.
// The Next Line contains N Binary numbers separated by space.

// Constraints
// Output Format
// Print Valid If the set of operations are valid Otherwise Print Invalid for each Test Case separated by a new Line.

// Sample Input
// 2
// 5
// 1 1 0 0 1
// 5
// 1 1 0 0 0 
// Sample Output
// Valid
// Invalid

package Super150.Stack_and_Queue;

import java.util.*;
public class Queue_Game {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n =scn.nextInt();
            int array[] = new int[n];
            for(int i=0;i<n;i++){
                array[i] = scn.nextInt();
            }
            CHECH_QUEUE(array);
            t--;
        }
    }
    public static void CHECH_QUEUE(int array[]){
        int len = array.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<len;i++){
            if(array[i]==1){
                 stack.push(1);
            }
            else if(stack.isEmpty() && array[i]==0){
                System.out.println("Invalid");
                return;
            }
            else if(array[i]==0){
                stack.pop();
            }
        }
        System.out.println("Valid");
    }
}
