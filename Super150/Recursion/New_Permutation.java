// Kartik and Parth and very obsessed with strings. then they decided to play a game. 
// where Parth given kartik a string and ask him to print all the possible strings in lexographical
//  order(smaller first and then largest). But while calculating the permuation the following 
//  condition must be satisfied. That he can change every letter individually to be lowercase 
//  or uppercase to create another string. without changing the order

// Input Format
// string input

// Constraints
// 1 <= s.length <= 12

// Output Format
// all possibel permuation of strings under given condition

// Sample Input
// 3z4
// Sample Output
// 3z4 3Z4

package Super150.Recursion;

import java.util.*;
public class New_Permutation {
    public static void main (String args[]) {
      Scanner scn = new Scanner(System.in);
      String thakur = scn.next();
      Permutation_of_String(thakur,"" );
    }
    public static void Permutation_of_String(String thakur , String ans){
       if(thakur.length()==0){
           System.out.print(ans+" ");
           return;
       }
        char kunwar = thakur.charAt(0);
		if(Character.isAlphabetic(kunwar)){
			Permutation_of_String(thakur.substring(1) , ans + Character.toLowerCase(kunwar));
            Permutation_of_String(thakur.substring(1) , ans + Character.toUpperCase(kunwar));
		}
		else{
			Permutation_of_String(thakur.substring(1) , ans + kunwar);
		}
    }
}
