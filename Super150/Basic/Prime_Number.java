import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }
    }
}
