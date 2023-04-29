// You are given an array arr of n integers, you have to rearrange the array in such a way 
// that element at odd index should be greater than the element at previous even index. 
// Array has 0 based indexing.

// Input Format
// First Line Denotes Number of Test Case Each test case consists of an integer N denoting
//  number of elements in the array. next line contains the N space-separated integers.

// Constraints
// 1 <= T <= 100
// 1 <= N <= 100
// 1 <= arr[i] <= 100

// Output Format
// If the array formed is according to rules print 1, else 0.

// Sample Input
// 1
// 5
// 5 4 3 2 1
// Sample Output
// 1
// Explanation
// The given array after modification will be as such: 4 5 2 3 1.

package Super150.Array;

import java.util.*;
public class Play_with_an_Array {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case-->0){
            int count = 0;
            int size = sc.nextInt();
            int monu[] = new int[size];
            for(int i=0;i<size;i++){
                monu[i] = sc.nextInt();
            }
            Arrays.sort(monu);
            for(int i=0;i<size-1;i++){
                if((monu[i+1] - monu[i]) > 0){
                     count++;
                }
            }
            if(count/2 >= size/2){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
