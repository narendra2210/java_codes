// Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.

// a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board. Print the value returned.

// b.Write a recursive function which prints all valid configurations (void is the return type for function).

// Input Format
// Enter the size of the chessboard N

// Constraints
// None

// Output Format
// Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner

// Sample Input
// 2
// Sample Output
// {0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1} 
// 6
package Super150.BackTraking;
import java.util.*;
public class N_Knight_Hard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        Knight_arrangements(board,"",0,0,0);
        System.out.println("\n" + count);
    }
    static int count=0;
    public static void Knight_arrangements(int board[][],String ans,int row,int col,int counter){
        if(counter == board.length){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(col == board.length){
            row = row+1;
            col = 0;
        }
        if(row == board.length){
            return;
        }
        if(board[row][col]==0 && check(board,row,col)==true){
            board[row][col]=1;
            Knight_arrangements(board, ans + "{" + row + "-" + col +"} ",row,col+1,counter+1);
            board[row][col]=0;
        }
        Knight_arrangements(board, ans, row, col+1, counter);
    }
    public static boolean check(int board[][],int row,int col){
        if(row-2 >= 0 && col-1 >= 0){
            if(board[row-2][col-1]==1){
                return false;
            }
        }
        if(row-2 >=0 && col+1 < board.length){
            if(board[row-2][col+1]==1){
                return false;
            }
        }
        if(row-1 >= 0 && col-2 >= 0){
            if(board[row-1][col-2]==1){
                return false;
            }
        }
        if(row-1 >= 0 && col+2 < board.length){
            if(board[row-1][col+2]==1){
                return false;
            }
        }
        return true;
    }
}
