// Take as input N, a number. Take N more inputs and store that in an array.

// a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

// b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.

// Input Format
// Take as input N, a number. Take N more inputs and store that in an array.

// Constraints
// None

// Output Format
// Display all the groups in a comma separated manner and display the number of ways the array can be split

// Sample Input
// 6
// 1
// 2
// 3
// 3
// 4
// 5
// Sample Output
// 1 2 3 3 and 4 5 
// 1 3 5 and 2 3 4 
// 1 3 5 and 2 3 4 
// 2 3 4 and 1 3 5 
// 2 3 4 and 1 3 5 
// 4 5 and 1 2 3 3 
// 6
package Super150.Recursion;
import java.util.*;
public class Recursion_Split_Array {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int total_sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total_sum= total_sum+arr[i];
        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        findSplit(arr, arr1, arr2, 0, 0, 0,total_sum / 2);
        System.out.print(count);
    }
    static int count=0;
    public static void findSplit(int[] arr, int[] arr1, int[] arr2, int index, int arr1Index, int arr2Index, int target_Sum) {
        if (index == arr.length) {
            int arr1Sum = 0;
            int arr2Sum = 0;
            for (int i = 0; i < arr1Index; i++) {
                arr1Sum += arr1[i];
            }
            for (int i = 0; i < arr2Index; i++) {
                arr2Sum += arr2[i];
            }
            if (arr1Sum == arr2Sum) {
                count++;
                for (int i = 0; i < arr1Index; i++) {
                    System.out.print(arr1[i] + " ");
                }
                System.out.print("and ");
                for (int i = 0; i < arr2Index; i++) {
                    System.out.print(arr2[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        arr1[arr1Index] = arr[index];
        findSplit(arr, arr1, arr2, index + 1, arr1Index + 1, arr2Index, target_Sum);

        arr2[arr2Index] = arr[index];
        findSplit(arr, arr1, arr2, index + 1, arr1Index, arr2Index + 1, target_Sum);
    }
}
