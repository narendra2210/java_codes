package Super150.Recursion;
import java.util.*;
public class Recursion_String_partitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String_partitioning(st,"");
    }
    static int count=0;
    public static void String_partitioning(String st,String ans){
        if(st.length()==0){
            count+=1;
            System.out.println(count + " - "+ ans);
            return;
        }
        for(int i=1;i<=st.length();i++){
            String str=st.substring(0,i);
            if(ispalindrome(str)){
                String_partitioning(st.substring(i),ans+str+"|");
            }
        }
    }
    public static boolean ispalindrome(String st){
        String s="";
        for(int i=st.length()-1;i>=0;i--){
            s = s + st.charAt(i);
        }
        boolean a=false;
        if(s.equals(st)){
            a=true; 
        } 
        return a;
    }
}