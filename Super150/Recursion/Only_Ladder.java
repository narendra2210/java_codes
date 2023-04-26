// Take as input N, a number. N is the size of a snakes and ladders board. There are no snakes
//  but we’ve ladders from 1st prime number to last prime number in range, 2nd prime number to 
//  2nd from last prime number and so-on.

// a. Write a recursive function which returns the count of different distinct ways this board 
// can be crossed with a normal dice. Print the value returned.

// b. Write a recursive function which prints all valid paths (void is the return type for function).

// Input Format
// Enter the size of the snake and ladders board N

// Constraints
// None

// Output Format
// Display the number of ways in which the board can be crossed and also display all the possible
//  ways to cross the board in a comma separated manner

// Sample Input
// 3
// Sample Output
// 0 1 2 END , 0 1 END , 0 2 END , 0 END , 
// 4

package Super150.Recursion;
import java.util.*;
public class Only_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans[] = Prime(n);
        //System.out.println(Arrays.toString(ans));
        int ladders[] = Make_ladder(n);
        System.out.println("\n" + Path(n, 0, ladders,""));
    }
    public static boolean[] Prime(int n){
        boolean ans[] = new boolean[n+1];
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

    public static int[] Make_ladder(int n){
        boolean prime[] = Prime(n);
        int ladders[] = new int[n+1];
        int i=0;
        int j=prime.length - 1;
        while(i<j){
            while(i<prime.length && prime[i]==true){
                i++;
            }
            while(j>=0 && prime[i]==true){
                j--;
            }
            if(i<j){
                ladders[i] = j;
                i++;j--;
            }
        }
        return ladders;
    }
    private static int Path(int n , int cc,int ladder[] , String answer){
        if(cc == n){
            System.out.println(answer + "END , ");
            return 1;
        }
        if(cc>n){
            return 0;
        }
        int count =0;
        if(ladder[cc]!=0){
            count = count + Path(n, ladder[cc], ladder, answer+cc+" ");
            return count;
        }

        for(int dice=1;dice<=6;dice++){
            count+=Path(n, cc+dice, ladder, answer+cc+" ");
        }
        return count;
    }
}
