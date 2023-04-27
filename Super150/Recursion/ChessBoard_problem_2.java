package Super150.Recursion;
import java.util.*;
public class ChessBoard_problem_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int minpot[] = mines_and_ports(n);
        int answer = Print_Path(n-1 , n , 0 , 0 ,"" , minpot);
        System.out.println("\n"+answer);
    }
    public static int Print_Path(int er , int ec , int cr, int cc,String ans,int minpot[]) {
        if(cr==er && cc==ec){
            System.out.print(ans+"{" + cr + "-" + cc + "}"+" ");
            return 1;
        }
        if(cr > er || cc>ec){
            return 0;
        }
        int val = cr*(er+1)+(cc+1);
        if(minpot[val] == 1){
            return 0;
        }
         int count = 0;
        if(minpot[val] == 2){
            count = count + Print_Path(er, ec, cr, cc, ans + "{" + cr + "-" + cc + "}", minpot);
        }
        //Knight
        count = count + Print_Path(er , ec, cr+2, cc+1, ans + "{" + cr + "-" + cc + "}K" , minpot);
        count = count + Print_Path(er , ec, cr+1, cc+2, ans + "{" + cr + "-" + cc + "}K" ,  minpot);

        //Rook
        if(cr==0 ||cc ==0 || cr==ec || cr==er){
            for (int i = 1; i <= er; i++){
                count = count + Print_Path(er , ec , cr+i , cc , ans + "{" + cr + "-" + cc + "}R" , minpot);
            }
            for (int i = 1; i < ec; i++){
                count = count + Print_Path(er , ec , cr , cc+i , ans + "{" + cr + "-" + cc + "}R" , minpot);
            }
        }

        // Bishop

        if (cr == cc || cr + cc == ec - 1) {
            for (int i = 1; i < er; i++) {
                count = count + Print_Path(er , ec , cr+i , cc+i , ans + "{" + cr + "-" + cc + "}B" , minpot);
            }
        }
        return count;
    }

    public static boolean[] Prime(int n){
        boolean ans[] = new boolean[(n*n)+1];
        ans[0] = ans[1] = true;
        for(int i=2;i<ans.length;i++){
            if(ans[i] == false){
                for(int j=2;j*i<ans.length;j++){
                    ans[i*j] = true;
                }
            }
        }
        return ans;
    }

    public static int[] mines_and_ports(int n){
        int minpot[] = new int[(n*n)+1];
        boolean prime[] = Prime(n);
        int count = 1;
        for(int i=0;i<n+1;i++){
            if(prime[i] ==false){
                if(count%2==1){
                    minpot[i]=1;
                }
                else{
                    minpot[i]=2;
                    count++;
                }
            }
        }
        return minpot;
    }
}
