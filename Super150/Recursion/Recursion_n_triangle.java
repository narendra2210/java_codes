// Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.

// Input Format
// Integer N is the single line of input.

// Constraints
// 1 <= N <= 100

// Output Format
// Print the output as a single integer which is the nth triangle.

// Sample Input
// 3
// Sample Output
// 6
package Super150.Recursion;
import java.util.*;
public class Recursion_n_triangle {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(triangle(n,1));
    }
    public static int triangle(int n,int i){
        if(i==n){
            return i;
        }
        return i+triangle(n,i+1);
    }
}
