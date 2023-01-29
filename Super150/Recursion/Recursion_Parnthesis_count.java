package Super150.Recursion;

public class Recursion_Parnthesis_count {
    public static void main(String[] args) {
        int n=4;
        System.out.println("\n"+"Total combination is : "+Paranthesis_count(n,"",0,0));
    }
    static int count=0;
    public static int Paranthesis_count(int n,String ans,int open,int close){
        int a=0;
        int b=0;
        if(open==n && close==n){
            System.out.print(ans +" ");
            count++;
            return 1;
        }
        if(open<n){
            a=Paranthesis_count(n,ans+"(", open+1, close);
        }
        if(close<n && close<open){
            b=Paranthesis_count(n,ans+")", open, close+1);
        }
        return a+b;
    }
    // public static void main(String[] args) {
    //     int n=3;
    //     Paranthesis_count(n,"",0,0);
    //     System.out.println("\n"+"Total number of combination is : "+count);
    // }
    // static int count=0;
    // public static void Paranthesis_count(int n,String ans,int open,int close){
    //     if(open==n && close==n){
    //         System.out.print(ans +" ");
    //         count++;
    //         return;
    //     }
    //     if(open<n){
    //         Paranthesis_count(n,ans+"(", open+1, close);
    //     }
    //     if(close<n && close<open){
    //         Paranthesis_count(n,ans+")", open, close+1);
    //     }
    // }
}
