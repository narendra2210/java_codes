public class Bin_To_Dec {
    public static void main(String[] args) {

        int n = 10010;
        int mul = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans + rem * mul;
            mul = mul * 2;
            n /= 10;

        }
        System.out.println(ans);

    }
}
