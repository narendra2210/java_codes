package Super150.Pattern;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n >= i){
            int a = 1;
            while(i >= a){
                System.out.print("* ");
                a++;
            }
            i++;
            System.out.println();
        }
    }
}
