// Take as input str, a string.

// a.) Write a recursive function which counts the number of times ‘hi’ appears in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// b.) Write a recursive function which removes all ‘hi’ in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// c.) Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

// Input Format
// Enter the String

// Constraints
// None

// Output Format
// Display the total no.of ''hi'' (''hi'' should not be followed by a 't'), string in which all ''hi'' are removes(''hi'' should not be followed by a 't'), string in which all ''hi'' are replace by ''bye''(''hi'' should not be followed by a 't')

// Sample Input
// abchihitfhi
// Sample Output
// 2
// abchitf
// abcbyehitfbye
package Super150.Recursion;
import java.util.*;
public class Recursion_Replace_hi2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println(Count_hi(st,0));
        Remove_hi(st,"");
        Replace_hi(st,"");
    }
    public static int Count_hi(String st,int count){
        if(st.length()==0){
            return count;
        }
        String str1="";
        if(st.length()>1){
            str1=st.substring(0,2);
        }
        String str2="";
        if(st.length()>2){
            str2=st.substring(0,3);
        }
        if(str1.equals("hi")==true && str2.equals("hit")==false){
            count++;
        }
        return Count_hi(st.substring(1),count);
    }
    public static void Remove_hi(String st,String ans){
        if(st.length()==0){
            System.out.println(ans);
            return;
        }
         String str1="";
        if(st.length()>1){
            str1=st.substring(0,2);
        }
        String str2="";
        if(st.length()>2){
            str2=st.substring(0,3);
        }
        if(str1.equals("hi")==true && str2.equals("hit")==false){
            Remove_hi(st.substring(2),ans);
        }
        else{
        Remove_hi(st.substring(1),ans+st.charAt(0));
        }
    }
    public static void Replace_hi(String st,String ans){
        if(st.length()==0){
            System.out.println(ans);
            return;
        }
         String str1="";
        if(st.length()>1){
            str1=st.substring(0,2);
        }
        String str2="";
        if(st.length()>2){
            str2=st.substring(0,3);
        }
        if(str1.equals("hi")==true && str2.equals("hit")==false){
            Replace_hi(st.substring(2),ans+"bye");
        }
        else{
            Replace_hi(st.substring(1),ans+st.charAt(0));
        }
    }
}
