// Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
// The output strings should be printed in the sorted order considering '(' has higher value than ')'.

// Input Format
// Single line containing an integral value 'n'.

// Constraints
// 1<=n<=11

// Output Format
// Print the balanced parentheses strings with every possible solution on new line.

// Sample Input
// 2
// Sample Output
// ()() 
// (()) 
package Super150.Recursion;

import java.util.*;
public class Recursion_Generate_Paranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        Paranthesis(n,"", 0, 0);
    }
    public static void Paranthesis(int n,String ans,int open,int close){
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }
        if(close<n & close<open){
            Paranthesis(n,ans+")", open, close+1);
        }
        if(open<n){
            Paranthesis(n,ans+"(", open+1, close);
        }
    }
}