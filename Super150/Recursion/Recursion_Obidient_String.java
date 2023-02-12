// Take as input str, a string. Write a recursive function that checks if the string was generated using the following rules and returns a Boolean value:
// 1. the string begins with an 'a'
// 2. each 'a' is followed by nothing or an 'a' or "bb"
// 3. each "bb" is followed by nothing or an 'a' Print the value returned.

// Input Format
// Enter the String

// Constraints
// None

// Output Format
// Display the boolean result

// Sample Input
// abba
// Sample Output
// true
package Super150.Recursion;

import java.util.*;
public class Recursion_Obidient_String {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println(Obidient_String(st,0));
    }
    public static boolean Obidient_String(String st,int i){
        if(st.length()-1==i && st.charAt(i)=='a'){
            return true;
        }
        if(st.length()==i){
            return true;
        }
        if(st.length()-1>i && st.charAt(i)=='a' && st.charAt(i+1)=='a'){
            return Obidient_String(st,i+1);
        }
        else if(st.length()-2>i && st.charAt(i)=='a' && st.charAt(i+1)=='b' && st.charAt(i+2)=='b'){
            return Obidient_String(st,i+3);
        }
        return false;
    }
}