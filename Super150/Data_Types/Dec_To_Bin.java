public class Dec_To_Bin {
    public static void main(String[] args) {

        int n = 45;
        int mul = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 2;
            ans = ans + rem * mul;
            mul = mul * 10;
            n /= 2;

        }
        System.out.println(ans);

    }
}
