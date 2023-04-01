// A knight is a piece used in the game of chess. The chessboard itself is square array of cells. Each time a knight moves, its resulting position is two rows and one column, or two columns and one row away from its starting position. Thus a knight starting on row r, column c – which we’ll denote as (r,c) – can move to any of the squares (r-2,c-1), (r-2,c+1), (r-1,c-2), (r-1,c+2), (r+1,c-2), (r+1,c+2), (r+2,c-1), or (r+2,c+1). Of course, the knight may not move to any square that is not on the board.

// Suppose the chessboard is not square, but instead has rows with variable numbers of columns, and with each row offset zero or more columns to the right of the row above it. The figure to the left illustrates one possible configuration. How many of the squares in such a modified chessboard can a knight, starting in the upper left square (marked with an asterisk), not reach in any number of moves without resting in any square more than once? Minimize this number.

// Imgur

// If necessary, the knight is permitted to pass over regions that are outside the borders of the modified chessboard, but as usual, it can only move to squares that are within the borders of the board.

// Input Format
// First line contains an integer n, representing the side of square of chess board. The next n line contains n integers separated by single spaces in which jjth integer is 1 if that cell(i,j) is part of chessboard and 0 otherwise.

// Constraints
// The maximum dimensions of the board will be 10 rows and 10 columns. That is, any modified chessboard specified by the input will fit completely on a 10 row, 10 column board.

// Output Format
// Print the minimum number of squares that the knight can not reach.

// Sample Input
// 3
// 1 1 1
// 1 1 1
// 1 1 1
// Sample Output
// 1

package Super150.Recursion;

import java.util.*;
public class Funcy_ChessBoard_Problem {
    static int counting_of_boardpath = 0;
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[][] board = new int[size][size];
        int sum_of_board_row = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scn.nextInt();
                if (board[i][j] == 1) {
                    sum_of_board_row++;
                }
            }
        }
        funky_ChessBoard_Problem(board , 0 , 0 , 0 , size);
        System.out.println(sum_of_board_row - counting_of_boardpath);
    }
    public static void funky_ChessBoard_Problem(int[][] board , int roww , int coll , int counter , int size) {
        if (roww >= size || roww < 0 || coll >= size || coll < 0 || board[roww][coll] == 0) {
            return;
        }
        board[roww][coll] = 0;
        if (counting_of_boardpath < counter + 1) {
            counting_of_boardpath = counter + 1;
        }
        funky_ChessBoard_Problem(board , roww - 1 , coll - 2 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww - 2 , coll - 1 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww + 1 , coll - 2 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww + 2 , coll - 1 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww - 1 , coll + 2 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww - 2 , coll + 1 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww + 1 , coll + 2 , counter + 1 , size);
        funky_ChessBoard_Problem(board , roww + 2 , coll + 1 , counter + 1 , size);
        board[roww][coll] = 1;
    }
}
