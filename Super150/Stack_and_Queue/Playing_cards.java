// You are at a casino. There are N stacked cards on pile A0. Each card has a number written on it.
//  Then there will be Q iterations. In ith iteration, you start picking up the cards in Ai-1th pile
//   from the top one by one and check whether the number written on the card is divisible by the 
//   ith prime number. If the number is divisible, you stack that card on pile Bi. Otherwise, 
//   you stack that card on pile Ai. After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ
//   , AQ . Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, .
//    . . BQ, AQ .

// Input Format
// First line contains N and Q. The next line contains N space separated integers representing the
//  initial pile of cards i.e., A0. The leftmost value represents the bottom plate of the pile.

// Constraints
// N < 10^5
// Q < 10^5
// |Ai| < 10^9

// Output Format
// Output N lines, each line containing the number written on the card.

// Sample Input
// 5 1
// 3 4 7 6 5
// Sample Output
// 4
// 6
// 3
// 7
// 5
// Explanation
// Initially:

// A0 = [3, 4, 7, 6, 5]<-TOP

// After 1st iteration:

// A0 = []<-TOP

// A1 = [5, 7, 3]<-TOP

// B1 = [6, 4]<-TOP

// Now first print B1 from top to bottom then A1 from top to bottom.

package Super150.Stack_and_Queue;

import java.util.*;
public class Playing_cards {
	public static void Check_Primes(ArrayList<Integer> vegita) {
		boolean[] prime_list = new boolean[100001];
		prime_list[0] = true;
		prime_list[1] = true;
		//Prime_Seive
		for (int k = 2; k * k <= 100000; k++) {
			if (prime_list[k] == false) {
				vegita.add(k);
				for (int chichi = 2; chichi * k <= 100000; chichi++) {
					prime_list[k * chichi] = true;
				}
			}
		}
		for (int k = 2;k <= 100000;k++) {
			if (!prime_list[k]) {
				vegita.add(k);
			}
		}
	}
	public static void Playing_cards_game(Stack<Integer> data , int iteration) {
		Stack<Integer> goku1 = new Stack<>();
		Stack<Integer> goku2 = new Stack<>();
		ArrayList<Integer> vegita = new ArrayList<>();
		Check_Primes(vegita);
		for (int i = 1;i <= iteration;i++) {
			int element = vegita.get(i - 1);
			while (!data.isEmpty()) {
				int variable = data.pop();
				if (variable % element == 0){
					goku2.push(variable);
				} 
				else{
					goku1.push(variable);
				}
			}
			while (!goku2.isEmpty()) {
				System.out.println(goku2.pop());
			}
			data = goku1;
			goku1 = new Stack<>();
		}
		while (!data.isEmpty()) {
			System.out.println(data.pop());
		}
	}
	public static void main(String args[]) {
        // Your Code Here
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int iteration = scn.nextInt();
		Stack<Integer> data = new Stack<>();
		for (int i = 0 ;i < number ; i++){
			int x = scn.nextInt();
			data.push(x);
		}
		Playing_cards_game(data , iteration);
	}
}