package Super150.Array;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        dispaly(arr);

    }

    public static void dispaly(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
