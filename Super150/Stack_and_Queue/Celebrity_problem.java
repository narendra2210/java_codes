// Kartik Bhaiya, mentor at Coding Blocks, organized a party for their interns at Coding Blocks.
//  In a party of N people, only one person is known to everyone. Such a person may be present in the 
//  party, if yes, she/he doesn’t know anyone in the party. We can only ask questions like “does A
//   know B? “.
// Find the stranger (celebrity) in minimum number of questions.

// Input Format
// First line contains N, number of persons in party. Next line contains the matrix of N x N which 
// represents A knows B when it's value is one.

// Constraints
// None

// Output Format
// Print the celebrity ID which is between 0 and N-1. If celebrity is not present then print "No Celebrity".

// Sample Input
// 4
// 0 0 1 0
// 0 0 1 0
// 0 0 0 0
// 0 0 1 0
// Sample Output
// 2
// Explanation
// In the given case there are 4 persons in the party let them as A, B, C, D. The matrix represents A knows B when it's value is one. From the matrix, A knows C, B knows C and D knows C. Thus C is the celebrity who doesnot know anyone and it's ID is 2. Hence output is 2.

package Super150.Stack_and_Queue;

import java.util.*;
public class Celebrity_problem {
    public static void main(String args[]) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int matrices[][] = new int[n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 matrices[i][j] = scn.nextInt();
             }
         }
         Find_Celebrity(matrices);
    }
    public static void Find_Celebrity(int matrices[][]){
        int answer = 0;
        int len = matrices.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=0;j<len;j++){
                if(matrices[i][j]==1){
                    stack.push(j);
                }
                else{
                    count++;
                }
            }
            if(count == len){
                answer = i;
            }
        }
        int counter = 0;
        while(!stack.isEmpty()){
            if(stack.pop()==answer){
                counter++;
            }
        }
        if(counter == len-1){
            System.out.println(answer);
        }
        else{
            System.out.println("No Celebrity");
        }
    }
}