package Super150.Time_Complexity;
import java.util.*;
public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeSieve(n);
    }
    public static void PrimeSieve(int n){ // PRIME SIEVE ALGORITHM
        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i=2;i*i<prime.length;i++){
           if(prime[i]==false){
            for(int k=2;k*i<prime.length;k++){
                prime[i*k] = true;
            }
           }
        } // false - prime
        for(int i=0;i<prime.length;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
