public class Sum_Less_Than_k {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 1, 2, 2};
        int k = 10;
        System.out.println(countnofSubarray(arr, k));

    }

    public static int countnofSubarray(int[] arr, int k) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int sum = 0;
        while (ei < arr.length) {
            // window grow
            sum = sum + arr[ei];

            // window Small
            while (sum * (ei - si + 1) >= k && si <= ei) {
                sum = sum - arr[si];
                si++;
            }

            // ans calculate (SubArray Length -> (ei - si + 1))
            ans = ans + (ei - si + 1);
            ei++;

        }
        return ans;

    }
}
