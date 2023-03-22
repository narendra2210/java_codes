package Super150.Time_Complexity;
import java.util.*;
public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int num = (int)Math.pow(n,0.5);
        for(int i=2;i<=num;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
