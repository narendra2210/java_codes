package Super150.Stack_and_Queue;
import java.util.*;
import java.util.Scanner;

public class Maximum_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int matrix[][] = new int[l1][l2];
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int arr[] = new int[matrix[0].length];
        Maximum_rectangle(matrix , arr);
    }
    public static void Maximum_rectangle(int matrix[][] , int arr[]){
         int n = matrix.length;
         arr = matrix[n-1];
         int ans = Histogram(arr);
         for(int i=n-2;i>=0;i--){
             for(int j=0;j<arr.length;j++){
                if(matrix[i][j]==1){
                    arr[j] = arr[j]+1;
                }
                else{
                    arr[j] = 0;
                }
             }
             int area = Histogram(arr);
             ans =Math.max(ans , area);
         }
         System.out.println(ans);
    }
    public static int Histogram(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int len =arr.length;
        int answer = 0;
        for(int i=0;i<len;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
               int h = arr[stack.pop()];
               int r = i;
               if(stack.isEmpty()){
                int a = h*r;
                answer = Math.max(answer , a);
               }
               else{
                int l =stack.peek();
                int a = h * (r-l-1);
                answer = Math.max(answer ,a);
               }
            }
            stack.push(i);
        }
        int r = arr.length;
        while(!stack.isEmpty()){
            int h = arr[stack.pop()];
            if(stack.isEmpty()){
             int a = h*r;
             answer = Math.max(answer , a);
            }
            else{
             int l =stack.peek();
             int a = h * (r-l-1);
             answer = Math.max(answer ,a);
            }
         }
        return answer;
    }
}
