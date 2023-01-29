package Super150.Recursion;

public class Recursion_perm {
    public static void main(String[] args) {
        perm(2,"",0);
    }
    public static void perm(int n,String ans,int count){
        if(n==count){
            System.out.print(ans+" ");
            return;
        }
        if(count==n){
            return;
        }
        perm(n,ans+"1",count+1);
        perm(n,ans+"0",count+1);
    }
}
