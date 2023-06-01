import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int star = 0;
        while (row < n) {

            int val = 1;
            int i = 0;
            while (star >= i) {
                System.out.print(val + " ");
                val = ((row - i) * val) / (i + 1);
                i++;
            }

            // updation
            star++;
            row++;
            System.out.println();
        }
    }
}
