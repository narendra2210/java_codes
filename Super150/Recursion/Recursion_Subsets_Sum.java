// Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

// a. Write a recursive function which prints subsets of the array which sum to target.

// b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

// Input Format
// Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

// Constraints
// None

// Output Format
// Display the number of subsets and print the subsets in a space separated manner.

// Sample Input
// 3
// 1
// 2
// 3
// 3
// Sample Output
// 1 2  3
// 2
// Explanation
// Add 2 spaces between 2 subset solutions
package Super150.Recursion;
import java.util.*;
public class Recursion_Subsets_Sum {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        print_subsets(arr,m,0,0,"");
        System.out.print("\n"+(Count_subsets(arr,m,0,0,"")));
    }
    static int count=0;
    public static int Count_subsets(int arr[],int m,int sum,int i,String ans){
        if(sum==m){
           sum=0;
           count=count+1;
           return 1;
        }
        if(i==arr.length){
            return 1;
        }
        for(;i<arr.length;i++){
            Count_subsets(arr,m,sum+arr[i],i+1,ans+arr[i]+" ");
        }
        return count;
    }
    public static void print_subsets(int arr[],int m,int sum,int j,String ans){
        if(sum==m){
            System.out.print(ans+" ");
           sum=0;
           return;
        }
        if(j==arr.length){
            return;
        }
        for(;j<arr.length;j++){
            print_subsets(arr,m,sum+arr[j],j+1,ans+arr[j]+" ");
        }
    }
}
