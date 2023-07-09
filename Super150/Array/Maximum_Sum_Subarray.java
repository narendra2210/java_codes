package Super150.Array;

public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        int arr[] = {1,2,7,5,11,4,2,1};
        Maximum(arr, 3);
    }
    public static void Maximum(int arr[] , int k){
        int max  = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        max = Math.max(max , sum);
        for(int i = k ; i< arr.length;i++){
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max , sum);
        }
        System.out.println(max);
    }
}