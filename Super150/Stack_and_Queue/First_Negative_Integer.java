// You are given given an array and a positive integer k, find the first negative integer for each 
// and every window(contiguous subarray) of size k. If a window does not contain a negative integer, 
// then print 0 for that window.

// Input Format
// First line contains integer t as number of test cases. Each test case contains two lines.
//  First line contains two integers n and k where n is length of the array and k is the size 
//  of window and second line contains n space separated integer.

// Constraints
// 1 < t < 10 1< n, k < 10000000

// Output Format
// For each test case you have to print the required output as given below.

// Sample Input
// 2
// 8 3
// 12 -1 -7 8 -15 30 16 28
//  8 4
// 12 -1 -7 8 -15 30 16 28
// Sample Output
// -1 -1 -7 -15 -15 0 
// -1 -1 -7 -15 -15
// Explanation
// For first test case : Subarray of window size 3 is ( 12 -1 -7), (-1, -7, 8), and so on.. 
// Take first negative number from each window and print them.

package Super150.Stack_and_Queue;

import java.util.*;

public class First_Negative_Integer {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scn.nextInt();
            }
            Negative_Window(array, k);
            t--;
        }
    }

    public static void Negative_Window(int array[], int k) {
        int len = array.length;
        int answer[] = new int[len - k + 1];
        for (int j = 0; j < answer.length; j++) {
            for (int i = j; i < j + k; i++) {
                if (array[i] < 0) {
                    answer[j] = array[i];
                    break;

                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}
