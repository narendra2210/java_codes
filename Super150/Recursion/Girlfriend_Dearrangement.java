// Monu bhaiya wants to count all his girlfriend's Derangement. A Derangement is a permutation 
// of n elements, so no element appears in its original position. For example, a derangement 
// of {0, 1, 2, 3} is {2, 3, 1, 0}. Given a number n, find the total number of Derangements 
// of a set of n elements.

// Input Format
// An integer N

// Constraints
// N=[1,10^6]

// Output Format
// Number of possible derangements

// Sample Input
// 2
// Sample Output
// 1
// Explanation
// For two elements say {0, 1}, there is only one possible derangement {1, 0}

package Super150.Recursion;

import java.util.*;
public class Girlfriend_Dearrangement {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String thakur="";
        for(int i=0;i<number;i++){
            thakur = thakur + i;
        }
        int length_of_string = thakur.length();
        Dearrangement_Count(thakur , "" , length_of_string);
        System.out.print(count);
    }
    static int count = 0;
    public static void Dearrangement_Count(String thakur ,  String str ,int length_of_string){
        if(str.length() == length_of_string){
            int counter = 0;
            for(int k=0;k<length_of_string;k++){
                if(str.charAt(k) != (char)(k + '0')){
                    counter++;
                }
            }
            if(counter == length_of_string){
                count++;
            }
            return;
        }
        for(int i=0;i<thakur.length();i++){
            String s1 = thakur.substring(0,i);
            String s2 = thakur.substring(i+1);
            Dearrangement_Count(s1+s2 , str + thakur.charAt(i)  , length_of_string);
        }
    }
}
