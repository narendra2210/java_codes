package Super150.Recursion;

public class RecursionPrint {
    public static void main(String[] args) {
        int n=5;
        print(n);
        printa(n);
        // System.out.println(print(n));
    }
    // public static int print(int n){
    //     if(n==1)
    //        return 1;
    //     System.out.println(n);
    //     return print(n-1);
    // } 
    public static void print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);
        }
    }
    // public static void printa(int n){
    //     if(n==0)
    //        return;
    //     printa(n-1);
    //     System.out.println(n);
        
    // }
    public static void printa(int n){
        if(n>0){
            printa(n-1);
            System.out.println(n);
        }
    }
}
