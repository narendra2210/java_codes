package Super150.BitMasking;

public class Left_Right_Shift {
    public static void main(String[] args) {
        System.out.println("Left Shift");
        int n = 5;
        System.out.println(n << 3); // left shift
        int n1 = -5;
        System.out.println(n1 << 1);        
        System.out.println(1 << 32);        
        System.out.println(1 << 31);        
        System.out.println(7 << 31);        
        System.out.println(7 << 32);        
        System.out.println(32 << 32); 
        
        System.out.println("Right shift");
        int a = 20;
        System.out.println(a >> 1);// Right Shift

        int a1 = -20;
        System.out.println(a1 >> 1);

        int a2 = 21;
        System.out.println(a2 >> 1);

        int a3 = -21;
        System.out.println(a3 >> 1);
    }
}
