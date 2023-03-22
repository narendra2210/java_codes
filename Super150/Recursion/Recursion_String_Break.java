package Super150.Recursion;
import java.util.*;
public class Recursion_String_Break {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        Sub_Sequence(st,"",0);
    }
    public static void Sub_Sequence(String st,String ans,int i){
        if(ans.length()!=0){
           System.out.print(ans+" ");
           return;
        }
        for(;i<st.length();i++){
             Sub_Sequence(st, ans+st.charAt(i) , i++);
        }
    }
}
 