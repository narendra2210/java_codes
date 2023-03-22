package Super150.Recursion;

import java.util.*;
public class RecursionFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("The fibonacci series is : ");
        System.out.print(0 +" "+1+" ");
        for(int i=2;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n){
        if(n==1 || n==0)
           return n;
        return fibo(n-1)+fibo(n-2);
    }
}
