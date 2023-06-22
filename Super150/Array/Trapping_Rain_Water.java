package Super150.Array;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int arr[] = {1 ,2,3,4,3,2,5,2};
        System.out.println(RainWater(arr));
    }
    public static int RainWater(int arr[]){
        int len = arr.length;
        int left[] = new int[len];
        int right[] = new int[len];
        
        left[0] = arr[0];
        for(int i = 1;i<len;i++){
            left[i] = Math.max(left[i-1] , arr[i]);
        }

        right[len-1] = arr[len-1];
        for(int i = len - 2;i >= 0;i--){
            right[i] = Math.max(right[i+1] , arr[i]);
        }

        int ans = 0;
        for(int i=0;i<len;i++){
            int min = Math.min(left[i] , right[i]);
            ans = ans + (min - arr[i]);
        }
        return ans;
    }
}
