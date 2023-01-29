// Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order. In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

// Input Format
// Enter a number N.

// Constraints
// None

// Output Format
// Display all the numbers upto N in a lexicographical order

// Sample Input
// 10
// Sample Output
// 0 1 10 2 3 4 5 6 7 8 9 
package Super150.Recursion;
import java.util.*;
public class Recursion_Lexicografically {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        lexi(0,n);
    }
   public static void lexi(int curr,int n){
       if(curr>n){
           return;
       }
       System.out.print(curr+" ");
       int i=0;
       if(curr==0){
           i=1;
       }
       for(;i<=9;i++){
           lexi(curr*10+i,n);
       }
   }
}
