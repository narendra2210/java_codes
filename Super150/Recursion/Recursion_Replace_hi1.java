// Take as input str, a string. a.Write a recursive function which counts the number of times ‘hi’ appears in the string. Print the value returned. b.Write a recursive function which removes all ‘hi’ in the string. Print the value returned. c.Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. Print the value returned.

// Input Format
// Enter a string

// Constraints
// None

// Output Format
// Display the no. of 'hi', string without 'hi' , string in which 'hi' is replaced with 'bye'

// Sample Input
// abchibi
// Sample Output
// 1
// abcbi
// abcbyebi
package Super150.Recursion;
import java.util.*;
public class Recursion_Replace_hi1 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String st=sc.next();
        System.out.println(Count_hi(st,"",0));
        Remove_hi(st,"");
        Replace_hi(st,"");
    }
    public static int Count_hi(String st,String str,int count){
        if(st.length()==0){
            return count;
        }
        if(st.length()>1){
            str=st.substring(0,2);
        }
        if(str.equals("hi")){
            count=count+1;
        }
        return Count_hi(st.substring(1),"",count);
    }
    public static void Remove_hi(String st,String ans){
        if(st.length()==0){
            System.out.println(ans);
            return;
        }
          String str="";
        if(st.length()>1){
            str=st.substring(0,2);
        }
        if(str.equals("hi")){
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
          String str="";
        if(st.length()>1){
            str=st.substring(0,2);
        }
        if(str.equals("hi")){
            Replace_hi(st.substring(2),ans+"bye");
        }
        else{
            Replace_hi(st.substring(1),ans+st.charAt(0));
        }
    }
}
