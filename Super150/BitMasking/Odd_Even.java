package Super150.BitMasking;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 69;
        if((n & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
