// Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down).

// a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

// b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.

// e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).

// Input Format
// Enter the number of rows N and columns M

// Constraints
// None

// Output Format
// Display the total number of paths and display all the possible paths in a space separated manner

// Sample Input
// 3
// 3
// Sample Output
// VVHH VHVH VHHV HVVH HVHV HHVV
// 6 
package Super150.Recursion;

import java.util.*;
public class Recursion_Two_DimensionPath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        comb(0,0,"",N1,N2);
        System.out.println("\n"+count);
    }
    static int count=0;
    public static void comb(int v,int h,String ans,int row,int column){
        if(v==row-1 && h==column-1){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(v==row || h==column){
            return;
        }
        comb(v+1,h,ans+"V",row,column);
        comb(v,h+1,ans+"H",row,column);
    }
}

        // 1st way - Less complexity
        // if(v<row-1){
        //     Possible_Ways(v+1,h,ans+"H",row,column);
        // }
        // if(h<column-1){
        //     Possible_Ways(v,h+1,ans+"V",row,column);
        // }
        // 2nd way 
