// Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion

// Input Format
// Constraints
// 1 <= N <=1000

// Output Format
// Sample Input
// 5
// Sample Output
// 5
// 3
// 1
// 2
// 4
package Super150.Recursion;
import java.util.*;
public class Recursion_even_odd {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
           ODD(n);
           EVEN(n-1);
        }
        else{
            ODD(n-1);
            EVEN(n);
        }
    }
    public static void ODD(int n){
        if(n==0 || n==-1){
            return;
        }
        System.out.println(n);
        ODD(n-2);
    }
     public static void EVEN(int n){
        if(n==1 || n==0){
            return;
        }
        EVEN(n-2);
        System.out.println(n);
    }
}
