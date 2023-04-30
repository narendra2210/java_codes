// Write a program to print all the LEADERS in the array. An element is leader if it is 
// greater than all the elements to its right side. And the rightmost element is always a leader.
//  For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

// Input Format
// First line contains size of the array.
// Second line contains the elements of the array.

// Constraints
// 1 <= Size of array <= 100000

// Output Format
// Print the leaders in increasing order.

// Sample Input
// 4
// 5 7 10 6 
// Sample Output
// 6 10 

package Super150.Array;
import java.util.Scanner;
public class Leader_in_a_Array {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int monu[] = new int[size];
        for(int i=0;i<size;i++){
            monu[i] = scn.nextInt();
        }
        int max = monu[size-1];
        System.out.print(max + " ");
        for(int i = size-2;i>=0;i--){
            if(max < monu[i]){
                System.out.print(monu[i] + " ");
                max = monu[i];
            }
        }
     }
}
