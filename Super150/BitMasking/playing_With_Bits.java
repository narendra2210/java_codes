// Prateek Bhayia likes to play with bits. One day Prateek bhayia 
// decides to assign a task to his student Sanya. You have help 
// Sanya to complete this task. Task is as follows - Prateek Bhayia 
// gives Q queries each query containing two integers a and b. 
// Your task is to count the no of set-bits in for all numbers 
// between a and b (both inclusive)

// Input Format
// Read Q - No of Queries, Followed by Q lines containing 2 
// integers a and b.

// Constraints
// Q,a,b are integers.

// Output Format
// Q lines, each containing an output for your query.

// Sample Input
// 2
// 1 1
// 10 15
// Sample Output
// 1
// 17


package Super150.BitMasking;
import java.util.*;
public class playing_With_Bits {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int queries = scn.nextInt();
		while(queries-- > 0){
			int a = scn.nextInt();
			int b = scn.nextInt();
			int count = 0;
			for(int i = a ; i <= b ; i++){
				count = count + Count_Set_Bit(i);
			}
			System.out.println(count);
		}
    }
	public static int Count_Set_Bit(int n){
		int ans = 0;
        while(n > 0){
            if((n & 1)  == 1){
                ans++;
            }
            n = n >> 1;
        }
        return ans;
	}
}
