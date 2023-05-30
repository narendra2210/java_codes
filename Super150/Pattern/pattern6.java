package Super150.Pattern;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while (row <= n) {
            // space
            int i = 1;
            while (space >= i) {
                System.out.print("  ");
                i++;
            }

            // star
            int j = 1;
            while (star >= j) {
                System.out.print("* ");
                j++;
            }

            // Next row preparation
            star--;
            space = space + 2;
            row++;
            System.out.println();
        }
    }
}
