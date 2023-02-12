package Super150.BackTraking;

public class Recursion_Arrangement {
    public static void main(String[] args) {
        String st="abcd";
        int n=2;
        Arrangement(st,n,"",0,0);
    }
    public static void Arrangement(String st,int n,String ans,int count,int i){
        if(count==n){
            System.out.print(ans+" ");
            return;
        }
        for(;i<st.length();i++){
            Arrangement(st, n, ans+st.charAt(i), count+1,i+1);
        }
        //2nd way
        // if(ans.length()==n){
        //     System.out.println(ans+" ");
        //     return;
        // }
        // if(st.length()==0){
        //     return;
        // }
        // char ch=st.charAt(0);
        // Arrangement(st, n, ans);
        // Arrangement(st, n, ans+ch);
    }
}