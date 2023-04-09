// You are given an array of integers nums, there is a sliding window of size k which is moving 
// from the very left of the array to the very right. You can only see the k numbers in the window.
//  Each time the sliding window moves right by one position.

// Return the max sliding window.

 

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7

package Super150.Stack_and_Queue;

import java.util.*;
public class Sliding_Window_Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans[] = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));
	}

	public static int[] maxSlidingWindow(int[] arr, int k) {

		Deque<Integer> dq = new LinkedList<Integer>();
		int[] ans = new int[arr.length - k + 1];
		int j = 1;
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);// add last

		}
		ans[0]=arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
			if (!dq.isEmpty() && dq.getFirst() == i - k) {
				dq.removeFirst();
			}
			ans[j] = arr[dq.getFirst()];
			j++;

		}
		return ans;

	}
}
