// Take an input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. 
//“twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string.
//Print the value returned.

// Input Format
// Enter the string

// Constraints
// None

// Output Format
// Display the number of twins

// Sample Input
// AXAXA
// Sample Output
// 3
package Super150.Recursion;
import java.util.*;
public class Recursion_Twins {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String st=sc.next();
    System.out.println(Recursion_twin(st, 0));
	}
public static int Recursion_twin(String st, int count) {
	if(st.length()==2) {
		return count;
	}
	char ch1=st.charAt(0);
	char ch2=st.charAt(2);
	String str=st.substring(1);
	if(ch1==ch2) {
		count++;
	}
	return Recursion_twin(str,count);
}
}
