package Super150.Array;

public class Subarray_less_than_k {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(Product(arr , 10));
    }
    public static int Product(int nums[] , int k){
        int si = 0;
        int ei = 0;
        int ans = 0;
        int product = 1;
        while(ei < nums.length){

            //Window grow 
            product = product * nums[ei];

            // window small
            while(product >= k && si <= ei){
                product = product / nums[si];
                si++;
            }

            //Answer calculate
            ans = ans + (ei - si + 1);
            ei++;
        }
        return ans;
    }
}
