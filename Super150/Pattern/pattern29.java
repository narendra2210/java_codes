package Super150.Pattern;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 0;
        int star = 2 * n + 1;
        int val = n;
        while (row <= (2 * n + 1)) {

            int i = 1;
            while (space >= i) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int v = val;
            while (star >= j) {
                System.out.print(v + " ");
                if (j <= star / 2) {
                    v--;
                } else {
                    v++;
                }
                j++;
            }

            if (row <= n) {
                space++;
                star = star - 2;
                val--;
            } else {
                space--;
                star = star + 2;
                val++;
            }
            System.out.println();
            row++;
        }
    }
}
