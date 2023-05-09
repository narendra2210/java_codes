package Super150.Array;
import java.util.*;
public class Maximum {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int kohli[] = new int[size];
        for(int i=0;i<size;i++){
            kohli[i] = scn.nextInt();
        }
        Arrays.sort(kohli);
        int maximum = 0;
        int sum = 1;
        for(int i=0;i<kohli.length-1;i++){
            if(kohli[i] == kohli[i+1]){
                sum++;
            }
            else{
                sum = 1;
            }
            maximum = Math.max(sum , maximum);
        }
        maximum = Math.max(sum , maximum);
        System.out.println(maximum);
    }
}


