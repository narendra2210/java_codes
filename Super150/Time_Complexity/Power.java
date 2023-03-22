package Super150.Time_Complexity;

public class Power {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }

        int ans = pow(a , b/2);
        ans = ans * ans;   // log(n)
        if(b % 2 !=0){
            ans = ans*a;
        }
        return ans;
    }
}
