package Super150.Recursion;

public class RecursionCoinPermutation {
    public static void main(String[] args) {
       String ans="";
       int n=3;
       perm(n,ans);
    }
    public static void perm(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
       perm(n-1,ans+"H");
       perm(n-1,ans+"T");
    }
}