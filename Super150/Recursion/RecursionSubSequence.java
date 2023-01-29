// Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

// a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

// b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
// Note: Use cin for input for C++

// Input Format
// Enter a string

// Constraints
// None

// Output Format
// Print all the subsequences in a space separated manner and isplay the total no. of subsequences.

// Sample Input
// abcd
// Sample Output
//  d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
// 16
// Explanation
// Print all possible subsequences of the given string.
package Super150.Recursion;
import java.util.*;
public class RecursionSubSequence {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        Sub_Sequence(st,"");
        System.out.print("\n"+Sub_Sequence_count(st,""));
    }
    public static void Sub_Sequence(String st,String ans){
        if(st.length()==0){
           System.out.print(ans+" ");
           return;
        }
        char ch=st.charAt(0);
        Sub_Sequence(st.substring(1),ans);
        Sub_Sequence(st.substring(1),ans+ch);
    }
    public static int Sub_Sequence_count(String st,String ans){
        if(st.length()==0){
           return 1;
        }
        char ch=st.charAt(0);
        int a=Sub_Sequence_count(st.substring(1),ans);
        int b=Sub_Sequence_count(st.substring(1),ans+ch);
        return a+b;
    }
}
 