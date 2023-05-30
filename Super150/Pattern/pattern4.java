package Super150.Pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i = i + 1;
            }

            // star
            int j = 1;
            while (j <= star) {
                System.out.print("*" + " ");
                j = j + 1;
            }

            // next row Prep
            row = row + 1;
            space = space - 1;
            star = star + 1;
            System.out.println();

        }
    }
}
