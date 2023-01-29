// Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

// Input Format
// Enter a number in form of a String

// Constraints
// 1 <= Length of String <= 10

// Output Format
// Print the number after converting it into integer

// Sample Input
// 1234
// Sample Output
// 1234
// Explanation
// Convert the string to int. Do not use any inbuilt functions.
package Super150.Recursion;
import java.util.*;
public class Recursion_string_to_integer {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.print(string(st,0));
    }
    static int count=0;
    public static int string(String st,int ans){
       if(st.length()==0){
           return ans;
       }
       return string(st.substring(1),(ans*10) + Integer.parseInt(st.substring(0,1)));
       // return string(st,i+1,(ans*10) + (st.charAt(i)-'0'));
    }
}
