// Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing.
//  Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and 
//  digits can’t repeat.

// Input Format
// The First Line contains an Integer N, size of the array. Next Line contains N Strings separated 
// by space.

// Constraints
// 1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

// Output Format
// Print the minimum number for each String separated by a new Line.

// Sample Input
// 4
// D I DD II
// Sample Output
// 21
// 12
// 321 
// 123
// Explanation
// For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.

package Super150.Stack_and_Queue;

import java.util.*;
public class Form_Minimum_number {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		while(number>0){
			String str = scn.next();
			int monu[]= new int[str.length() + 1];
			Stack<Integer> data= new Stack<>();
			int count_for_pattern = 1 ;
			for(int i=0; i<monu.length; i++){
				if(i == str.length() || str.charAt(i)=='I'){
					monu[i]= count_for_pattern++ ;
					while(!data.isEmpty() && str.charAt(data.peek())=='D'){
						monu[data.pop()]= count_for_pattern++ ;
					}
				}
				else {
					data.push(i);
				}
			}
			while(!data.isEmpty()){
				monu[data.pop()]= count_for_pattern++ ;
			}
			String answer = "";
			for(int i=0;i<monu.length;i++){
				answer = answer + monu[i] ;
			}
			System.out.println(answer) ;
			number = number-1;
		}
    }
}
