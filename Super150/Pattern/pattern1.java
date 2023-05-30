package Super150.Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;// number of star in each row
        while (row <= n) {

            // Start print

            int i = 1;// count of star
            while (i <= star) {
                System.out.print("*" + " ");
                i = i + 1;
            }
            // next Row Prep
            row = row + 1;
            System.out.println();

        }
    }
}
