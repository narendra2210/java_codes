// You are given an empty chess board of size N*N. Find the number of ways to place N queens on the board, such that no two queens can kill each other in one move. A queen can move vertically, horizontally and diagonally.

// Input Format
// A single integer N, denoting the size of chess board.

// Constraints
// 1 ≤ N < 15

// Output Format
// A single integer denoting the count of solutions.

// Sample Input
// 4
// Sample Output
// 2
package Super150.BackTraking;

import java.util.*;
public class N_queen_Hard {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int board[][]=new int[n][n];
       Queens_Arrangement(board,0);
       System.out.println(count);
    }
    static int count=0;
    public static void Queens_Arrangement(int board[][],int row){
       if(row==board.length){
        count++;
        return;
       }
        for(int col=0;col<board.length;col++){
            if(board[row][col]==0 &&  check(board,row,col)==true){
               board[row][col]=1;
               Queens_Arrangement(board, row+1);
               board[row][col]=0;
            }
        }
    }
    public static boolean check(int board[][],int row,int col){
        for(int i = row-1 ; i>=0 ; i--){
           if(board[i][col]==1){
            return false;
           }
        }
        for(int i = row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--){
           if(board[i][j]==1){
            return false;
           }
        }
        for(int i = row-1 , j=col+1 ; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i = col-1 ; i>=0 ; i--){
            if(board[row][i]==1){
                return false;
            }
        }
        return true;
    }
}
