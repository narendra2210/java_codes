package Super150.Stack_and_Queue;
import java.util.*;
public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Histogram(arr));
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
