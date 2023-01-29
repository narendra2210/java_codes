// Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

// Write a recursive function which:
// a. Returns the count of different ways the player can travel across the board. Print the value returned.
// b. Prints moves for all valid paths across the board.

// Input Format
// Enter the number of rows N1 and number of columns N2

// Constraints
// None

// Output Format
// Display the total number of paths and print all the possible paths in a space separated manner

// Sample Input
// 3
// 3
// Sample Output
// VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
// 13
package Super150.Recursion;
import java.util.*;
public class Recursion_Maze_path2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        print_path(0,0,"",n1,n2);
        System.out.print("\n"+count_path(0,0,"",n1,n2));
    }
    public static void print_path(int v,int h,String ans,int n1,int n2){
       if(v==n1-1 && h==n2-1){
            System.out.print(ans+" ");
            return;
        }
        if(v==n1 || h==n2){
            return;
        }
        print_path(v+1,h,ans+"V",n1,n2);
        print_path(v,h+1,ans+"H",n1,n2);
        print_path(v+1,h+1,ans+"D",n1,n2);
    }
    public static int count_path(int v,int h,String ans,int n1,int n2){
       if(v==n1-1 && h==n2-1){
            return 1;
        }
        if(v==n1 || h==n2){
            return 0;
        }
        int a=count_path(v+1,h,ans+"V",n1,n2);
        int b=count_path(v,h+1,ans+"H",n1,n2);
        int c=count_path(v+1,h+1,ans+"D",n1,n2);
        return a+b+c;
    }
}
