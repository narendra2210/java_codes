// Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.

// a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.

// b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

// Input Format
// Enter a number N (size of the board) and number M(number of the faces of a dice)

// Constraints
// None

// Output Format
// Display the number of paths and print all the paths in a space separated manner

// Sample Input
// 3
// 3
// Sample Output
// 111 12 21 3 
// 4
package Super150.Recursion;
import java.util.*;
public class Recursion_Boardpath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        snake_ladder(0,n,"",m);
        System.out.print("\n"+count(0,n,"",m));
    }
    public static void snake_ladder(int src,int des,String ans,int m){
        if(src==des){
            System.out.print(ans+" ");
            return;
        }
        if(src>des){
            return;
        }
        for(int i=1;i<=m;i++){
            snake_ladder(src+i,des,ans+i,m);
        }
    }
    public static int count(int src,int des,String ans,int m){
        int x=0;
        if(src==des){
            return 1;
        }
        if(src>des){
            return 0;
        }
        for(int i=1;i<=m;i++){
            x=x+count(src+i,des,ans+i,m);
        }
        return x;
    }
}
