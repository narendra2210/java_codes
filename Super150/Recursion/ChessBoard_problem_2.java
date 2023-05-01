// Take as input N, a number. N represents the size of a chess board. The cells in board are
//  numbered. The top-left cell is numbered 1 and numbering increases from left to right and
//   top to bottom. E.g. The following is the chessboard for a value of n=4.

// 1     2    3    4

// 5     6    7    8

// 9     10   11   12

// 13    14   15   16
// Prime numbers act as mines and ports alternately i.e. first prime number is a mine while
//  second is a port and so on. Piece can go over a mine but cannot stop on it. Piece can 
//  directly move from a port to the destination (but may not chose to).

// We’ve a piece standing in top-left corner and it must reach the bottom-right corner. 
// The piece moves as follows –

// a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, 
// only the positive ones are valid i.e. both row and column must increase in a move.

// b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of
//  knight moves). But, only the positive moves are allowed i.e. as a rook, piece can move any
//   number of steps horizontally or vertically but in a manner, such that row or column must increase.

// c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well 
// (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e.
//  as a bishop, piece can move in a way such that row and column must increase.

// You are supposed to write the following functions

// a. Write a recursive function which returns the count of different distinct ways this board can
//  be crossed. Print the value returned.

// b. Write a recursive function which prints all valid paths (void is the return type for function).

// Input Format
// Enter the size of the chessboard N

// Constraints
// None

// Output Format
// Display the total number of ways to cross the board and display all the possible paths in a space separated manner

// Sample Input
// 3
// Sample Output
// {0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-2}P{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}P{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}P{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{2-2}
// 14

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
