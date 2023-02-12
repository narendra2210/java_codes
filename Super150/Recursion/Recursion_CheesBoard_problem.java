// Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

// a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid i.e. both row and column must increase in a move.

// b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.

// c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.

// You are supposed to write the following functions

// a. Write a recursive function which prints all valid paths.

// b. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.

// Input Format
// Enter the size of the chessboard N

// Constraints
// None

// Output Format
// Display the total number of valid paths and print all the valid paths in a space separated manner

// Sample Input
// 3
// Sample Output
// {0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
// 18
package Super150.Recursion;
import java.util.*;
public class Recursion_CheesBoard_problem {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Chessboard(n,n,0,0,"");
        System.out.println("\n" + count);
    }
    static int count=0;
    public static void Chessboard(int row,int col,int c_row,int c_col,String ans){
        if(c_row==row-1 && c_col==row-1){
            System.out.print(ans + "{" + c_row + "-" + c_col + "} ");
            count+=1;
            return;
        }
        if(c_row >= row || c_col >= col){
            return;
        }
        // Knight

        Chessboard(row , col , c_row+2 , c_col+1 , ans + "{" + c_row + "-" + c_col + "}K");
        Chessboard(row , col , c_row+1 , c_col+2 , ans + "{" + c_row + "-" + c_col + "}K");

         // Rook

        if (c_row == 0 || c_col == 0 || c_row == row - 1 || c_col == col - 1) {
            for (int i = 1; i < col; i++){
                Chessboard(row , col , c_row , c_col+i , ans + "{" + c_row + "-" + c_col + "}R");
            }
            for (int i = 1; i < row; i++){
                Chessboard(row , col , c_row+i , c_col , ans + "{" + c_row + "-" + c_col + "}R");
            }
        }

        // Bishop

        if (c_row == c_col || c_row + c_col == row - 1) {
            for (int i = 1; i < row; i++) {
                Chessboard(row , col , c_row+i , c_col+i , ans + "{" + c_row + "-" + c_col + "}B");
            }
        }
    }
}
