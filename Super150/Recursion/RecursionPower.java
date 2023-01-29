package Super150.Recursion;

import java.util.Scanner;

public class RecursionPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));
    }
    public static int power(int a,int b){
        if(b==1)
            return a;
        return a*power(a,b-1);
    }
}
