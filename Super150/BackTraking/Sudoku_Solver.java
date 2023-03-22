// Write a program to solve a Sudoku puzzle by filling the empty cells.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.<br.

// Input Format
// First line contains a single integer N. Next N lines contains N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid. This value is 0, if the cell is empty.

// Constraints
// N=9
// At least one solution does exists for input matrix.

// Output Format
// Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid, such that all cells are filled.

// Sample Input
// 9
// 5 3 0 0 7 0 0 0 0 
// 6 0 0 1 9 5 0 0 0 
// 0 9 8 0 0 0 0 6 0 
// 8 0 0 0 6 0 0 0 3 
// 4 0 0 8 0 3 0 0 1 
// 7 0 0 0 2 0 0 0 6 
// 0 6 0 0 0 0 2 8 0 
// 0 0 0 4 1 9 0 0 5 
// 0 0 0 0 8 0 0 7 9 
// Sample Output
// 5 3 4 6 7 8 9 1 2 
// 6 7 2 1 9 5 3 4 8 
// 1 9 8 3 4 2 5 6 7 
// 8 5 9 7 6 1 4 2 3 
// 4 2 6 8 5 3 7 9 1 
// 7 1 3 9 2 4 8 5 6 
// 9 6 1 5 3 7 2 8 4 
// 2 8 7 4 1 9 6 3 5 
// 3 4 5 2 8 6 1 7 9 
package Super150.BackTraking;
import java.util.*;
public class Sudoku_Solver {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]sudoku = new int [n][n];
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                sudoku[i][j] = sc.nextInt();
            }
        }
        sudoku_solver(sudoku,0,0);
		
	}
	static boolean flag = false;
	public static void sudoku_solver(int [][] sudoku, int row, int col) {
		if(col == sudoku.length) {
			row++;
			col=0;
		}
         
        if(row == sudoku.length) {
			display(sudoku);
			flag = true;
			return;
		}

		if(flag){
            return;
        }

		if(sudoku[row][col]!=0){
            sudoku_solver(sudoku,row,col+1);
        }

		for(int i=1; i<=sudoku.length;i++) {
			if(sudoku[row][col]==0 && is_exist_3(sudoku, row, col, i) && is_exist_9(sudoku, row, col, i)) {
				sudoku[row][col] = i;
				sudoku_solver(sudoku, row, col+1);
				sudoku[row][col] = 0;
			}
		}
	}
	
	public static boolean is_exist_3(int [][]sudoku, int row, int col, int num) {
		int check_row = (row/3)*3;
		int check_col = (col/3)*3;
		for(int i=check_row; i<check_row+3;i++) {
			for(int j=check_col; j<check_col+3;j++) {
				if(sudoku[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean is_exist_9(int [][]sudoku, int row, int col, int num) {
		for(int i=0; i<sudoku.length;i++) {
			if(sudoku[i][col]==num) {
				return false;
			}
			if(sudoku[row][i]==num) {
				return false;
			}
		}
		return true;
	}
	
	public static void display(int [][] ans){
        for(int i=0; i<ans.length;i++){
            for(int j=0; j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
