package Super150.Recursion;
import java.util.*;
public class Recursion_Coin_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={2,3,5};
        Coin_Problem(n,"",0,arr);
    }
    public static void Coin_Problem(int n,String ans,int sum,int arr[]){
        if(sum==n){
            System.out.print(ans+" ");
            return;
        }
        if(sum>10){
            return;
        }
        for(int i=0;i<arr.length;i++){
            Coin_Problem(n,ans+arr[i],sum+arr[i],arr);
        }
        // 2nd way
        // Coin_Problem(n,ans+"2",sum+2);
        // Coin_Problem(n,ans+"3",sum+3);
        // Coin_Problem(n,ans+"5",sum+5);
    }
}
