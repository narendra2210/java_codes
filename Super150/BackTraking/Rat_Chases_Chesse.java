// You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
// Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.

// Input Format
// First line contains 2 integers N and M denoting the rows and columns in the grid.
// Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

// Constraints
// 1 <= N , M <= 10

// Output Format
// Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
// If a path does not exits then print "NO PATH FOUND"

// Sample Input
// 5 4
// OXOO
// OOOX
// XOXO
// XOOX
// XXOO
// Sample Output
// 1 0 0 0 
// 1 1 0 0 
// 0 1 0 0 
// 0 1 1 0 
// 0 0 1 1 
package Super150.BackTraking;

import java.util.*;
public class Rat_Chases_Chesse {
    static boolean f=false;
    public static void main(String args[]) {
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
           System.out.println("NO PATH FOUND");
       }
    }
    public static void Rat_chase(char ch[][],int cr,int cc,int ans[][]){
       if(cr==ch.length-1 && cc==ch[0].length-1){
           ans[cr][cc]=1;
           f=true;
           Display(ans);
           return;
       }
       if(cr<0 || cc<0 || cr>=ch.length || cc>=ch[0].length || ch[cr][cc]=='X'){
           return;
       }
       ch[cr][cc]='X';
       ans[cr][cc]=1;
       Rat_chase(ch,cr-1,cc,ans);//up
       Rat_chase(ch,cr+1,cc,ans);//down
       Rat_chase(ch,cr,cc+1,ans);//right
       Rat_chase(ch,cr,cc-1,ans);//left
       ch[cr][cc]='0';
       ans[cr][cc]=0;
    }
    public static void Display(int ans[][]){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
