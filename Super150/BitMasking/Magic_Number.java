// A magic number is defined as a number that can be expressed 
// as a power of 5 or sum of unique powers of 5. First few magic
//  numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
// Given the value of n, find the n'th Magic number modulo 109+7.

// Example 1:

// Input: n = 1
// Output: 5
// Explanation: 1'st Magic number is 5.


package Super150.BitMasking;

public class Magic_Number {
    public static void main(String[] args) {
        int n = 12;
        long ans = 0;
        long mul = 5;
        while(n > 0){
            if((n & 1) == 1){
                ans = ans + mul;
            }
            n = n >> 1;
            mul = mul * 5;
        }
        System.out.println(ans);
    }
}
