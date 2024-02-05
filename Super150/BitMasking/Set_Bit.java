package Super150.BitMasking;

public class Set_Bit {
    public static void main(String[] args) {
        int n = 67;
        int pos = 3;
        int mask = (1 << pos);
        if((n & mask) == 0){
            System.out.println("Set nhi h");
        }
        else{
            System.out.println("Set hai");
        }
    }
}
