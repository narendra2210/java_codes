import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n / 2;
        while (row <= n) {

            // space printing
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // star printing
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            // next row preparation
            if (row <= (n / 2)) {
                star = star + 2;
                space--;
            } else {
                star = star - 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
