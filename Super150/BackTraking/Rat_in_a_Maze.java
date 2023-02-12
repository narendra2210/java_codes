// You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
// Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, rat can reach this position. A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).

// Input Format
// First line contains 2 integers, N and M, denoting the rows and columns in the grid. Next N line contains. M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

// Constraints
// 1<=N,M<=1000 GRID(i,j)='X' or 'O'

// Output Format
// If a solution exists: Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
// If solution doesn't exist, just print "-1".

// Sample Input
// 5 4
// OXOO
// OOOX
// OOXO
// XOOO
// XXOO
// Sample Output
// 1 0 0 0 
// 1 1 0 0 
// 0 1 0 0 
// 0 1 1 1 
// 0 0 0 1 
package Super150.BackTraking;

import java.util.*;
public class Rat_in_a_Maze {
    static boolean f=false;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       char ch[][]=new char[m][n];
       int ans[][]=new int[m][n];
       for(int i=0;i<m;i++){
           String s=sc.next();
           for(int j=0;j<n;j++){
               ch[i][j] = s.charAt(j);
           }
       } 
       Rat_chase(ch,0,0,ans);
       if(f==false){
           System.out.println(-1);
       }
    }
    static int count=0;
    public static void Rat_chase(char ch[][],int cr,int cc,int ans[][]){
       if(cr==ch.length-1 && cc==ch[0].length-1 ){
           ans[cr][cc]=1;
           f=true;
           Display(ch,ans);
            count=count+1;
           return;
       }
       if(cr<0 ||cc<0|| cr>=ch.length || cc>=ch[0].length || ch[cr][cc]=='X'){
           return;
       }
       if(count==0){
       ch[cr][cc]='X';
       ans[cr][cc]=1;
       Rat_chase(ch,cr,cc+1,ans); //right
       Rat_chase(ch,cr+1,cc,ans);//down
    //    Rat_chase(ch,cr+1,cc,ans);//up
    //    Rat_chase(ch,cr,cc-1,ans);//left
       ch[cr][cc]='0';
       ans[cr][cc]=0;
       }
    }
    public static void Display(char ch[][],int ans[][]){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

