package Super150.Data_Types;

public class Loop_Demo {
    public static void main(String[] args) {

        for (byte b = 0; b < 127; ++b) {// b++;//b=(byte)(b+1)
            System.out.println(b);
        }

        byte b = 8;
        byte a = 12;
        byte c = (byte) (a + b);
        short s1 = 89;
        short s2 = 99;

        System.out.println(c);

    }
}
