// Given an integer N, now you have to convert all zeros of N to 5.

// Input Format
// The first Line takes input integer N, denoting the number.

// Constraints
// 1<=N<=10000

// Output Format
// Print the number after replacing all 0's with 5.

// Sample Input
// 103
// Sample Output
// 153
// Explanation
// Testcase 1: after replacing 0 with 5 ,number will become 153.
// Testcase 2: there is no zero in number so it will remain same.
package Super150.Recursion;
import java.util.*;
public class Recursion_Replace_zero_by_five {
    public static void main (String args[]) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=Replace_Zero(n,0);
          int temp=0;
          while(m>0){
              temp = (temp*10) +(m%10);
              m=m/10;
          }
          System.out.println(temp);
    }
    public static int Replace_Zero(int n,int ans){
        if(n==0){
            return ans;
        }
        if(n%10==0){
            ans = (ans*10) + 5;
        }
        else{
            ans = (ans*10) + (n % 10);
        }
        return Replace_Zero(n/10 , ans);
    }
}
