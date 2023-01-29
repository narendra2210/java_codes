package Super150.Recursion;
import java.util.*;
public class Recursion_Coin_Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={2,3,5};
        Coin_Problem(n,"",0,arr,0);
    }
    public static void Coin_Problem(int n,String ans,int sum,int arr[],int i){
        if(sum==n){
            System.out.print(ans+" ");
            return;
        }
        if(sum>10){
            return;
        }
        for(;i<arr.length;i++){
            Coin_Problem(n,ans+arr[i],sum+arr[i],arr,i);    //choice==call & combination==i+1
        }
    }
}
