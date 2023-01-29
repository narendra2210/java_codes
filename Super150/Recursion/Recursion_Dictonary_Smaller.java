// Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

// Input Format
// Single line input containing a string

// Constraints
// Length of string <= 10

// All characters are unique

// Output Format
// Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

// Sample Input
// cab
// Sample Output
// abc
// acb
// bac
// bca
// Explanation
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.
package Super150.Recursion;
import java.util.*;
public class Recursion_Dictonary_Smaller {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String st1=st;
        char charArray[] = st1.toCharArray();
        Arrays.sort(charArray);
        st1=new String(charArray);
        permutation(st1,"",st);
    }
    public static void permutation(String st1,String ans,String st){
        if(st1.length()==0){
            if(ans.compareTo(st)<0){
                System.out.println(ans);
            }
            return;
        }
        // Without Repetition
        for(int j=0;j<st1.length();j++){
            String s1=st1.substring(0,j);
            String s2=st1.substring(j+1);
            permutation(s1+s2,ans+st1.charAt(j),st);
        }
    }
}
