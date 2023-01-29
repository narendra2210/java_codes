// Replace all occurrences of pi with 3.14

// Input Format
// Integer N, no of lines with one string per line

// Constraints
// 0 < N < 1000
// 0 <= len(str) < 1000

// Output Format
// Output result one per line

// Sample Input
// 3
// xpix
// xabpixx3.15x
// xpipippixx
// Sample Output
// x3.14x
// xab3.14xx3.15x
// x3.143.14p3.14xx
// Explanation
// All occurrences of pi have been replaced with "3.14".
package Super150.Recursion;
import java.util.*;
public class Recursion_Replace_pi {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String st[]=new String[n];
      for(int i=0;i<n;i++){
          st[i]=sc.next();
          Replace_pi(st[i],"");
      }
    }

    public static void Replace_pi(String st,String ans){
          if(st.length()==0){
              System.out.println(ans);
              return;
          }
          String str="";
          if(st.length()>1){
            str=st.substring(0,2);
          }
          if(str.equals("pi")){
              Replace_pi(st.substring(2),ans+"3.14");
          }
          else{
              Replace_pi(st.substring(1),ans+st.charAt(0));
          }
    }
}
