package Super150.Recursion;

public class RecursionCountCoinpermutation {
    public static void main(String[] args) {
        String ans="";
        int n=3;
        System.out.println("Total number of perm is : " + perm(n,ans));
     }
     public static int perm(int n,String ans){
         if(n==0){
            return 1;
         }
        int a=perm(n-1,ans+"H");
        int b=perm(n-1,ans+"T");
        return a+b;
     }
}