// Take as input N, a number. N is the size of a snakes and ladders board. There are no snakes
//  but we’ve ladders from 1st prime number to last prime number in range, 2nd prime number to 
//  2nd from last prime number and so-on.

// a. Write a recursive function which returns the count of different distinct ways this board 
// can be crossed with a normal dice. Print the value returned.

// b. Write a recursive function which prints all valid paths (void is the return type for function).

// Input Format
// Enter the size of the snake and ladders board N

// Constraints
// None

// Output Format
// Display the number of ways in which the board can be crossed and also display all the possible
//  ways to cross the board in a comma separated manner

// Sample Input
// 3
// Sample Output
// 0 1 2 END , 0 1 END , 0 2 END , 0 END , 
// 4

package Super150.Recursion;

import java.util.*;
public class Main {
    static int count_for_ladder = 0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int size_of_board = scn.nextInt();
        int data[] = new int[size_of_board + 1];
        for(int i=2;i<size_of_board+1;i++){
            boolean flag_value = false;
			// Prime_seive
            for(int j=2 ; j*j<=i ; j++){
                if(i % j == 0){
                    flag_value = true;
                    break;
                }
            }
            if(flag_value == false){
				data[i] = 1;
            }
		}
		int j = size_of_board;
        int i = 0;
        while(i <= j){
            if(data[i] == 1 && data[j] != 1){
                j--;
            }
            else if(data[i] != 1 && data[j] == 1){
				i++;
			}
            else if(data[i] == 1 && data[j] == 1){
                data[i] = j;
                if(i != j){
					data[j]=0;
				}
                i++;
                j--;
            }
            else{
                i++;
				j--;
            }
        }
        Board_path(size_of_board , 0 , "0 " , data);
        System.out.println("\n" + count_for_ladder);
    }
    static void Board_path(int size_of_board , int counter, String answer , int data[]){
        if(size_of_board == counter){
            System.out.print(answer + "END , ");
            count_for_ladder++;
            return;
        }
        for(int i=1;i<=6;i++){
            if(counter + i < size_of_board){
                String rev = "";
                if(data[counter + i] != size_of_board){
					rev = data[counter + i] + " ";
				}
                if(data[counter + i] != 0)
                    Board_path(size_of_board , data[counter + i] , answer + (counter+i) + " " + rev , data);
                else 
				    Board_path(size_of_board , counter + i ,answer + (counter + i) + " " , data);
            }
            else if (counter + i == size_of_board){
                Board_path(size_of_board , counter + i , answer + "" , data);
            }
        }
    }
}