package Super150.Recursion;

public class RecursionSubSequencecount {
    public static void main(String[] args) {
        String st="abc";
        String ans="";//string combination having forwading and can be non-sequencial
        System.out.println("\n"+"total number of subSequence is : "+SubSequence(st,ans));
    }
    // static int count=0;
    public static int SubSequence(String st,String ans){
         if(st.length()==0){
            // System.out.print(ans+" ");
            // count++;
            // return count;
            return 1;
         }
         char ch=st.charAt(0);
         int a=SubSequence(st.substring(1),ans);
         int b=SubSequence(st.substring(1),ans+ch);
         return a+b;
    }
}