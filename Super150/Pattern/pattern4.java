package Super150.Pattern;

import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (n-- > 0) {
            int a = 1;
            int b = 1;
            while (n >= a) {
                System.out.print(" ");
                a++;
            }
            while (i >= b) {
                System.out.print("*");
                b++;
            }
            i++;
            System.out.println();
        }
    }
}
