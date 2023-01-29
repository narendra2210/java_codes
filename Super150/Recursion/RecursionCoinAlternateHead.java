package Super150.Recursion;

public class RecursionCoinAlternateHead {
    public static void main(String[] args) {
        int n=3;
        print(n,"");
    }
    public static void print(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            print(n-1,ans+"H");
        }
        print(n-1,ans+"T");
    }
}

