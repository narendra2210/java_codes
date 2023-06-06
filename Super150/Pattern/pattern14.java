import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = n - 1;
        while (row <= 2 * n - 1) {

            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // star
            int i = 1;
            while (i <= star) {
                System.out.print("*" + " ");
                i++;
            }

            // next row
            // mirror
            if (row < n) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
            row = row + 1;
            System.out.println();

        }
    }
}
