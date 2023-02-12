// We are given a hashmap which maps all the letters with number. Given 1 is mapped with A, 2 is mapped with B…..26 is mapped with Z. Given a number, you have to print all the possible strings.

// Input Format
// A single line contains a number.

// Constraints
// Number is less than 10^6

// Output Format
// Print all the possible strings in sorted order in different lines.

// Sample Input
// 123
// Sample Output
// ABC
// AW
// LC
// Explanation
// '1' '2' '3' = ABC
// '1' '23' = AW
// '12' '3' = LC
package Super150.Recursion;
import java.util.*;
public class Recursion_Mapped_String {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=num;
        char ch1[] = new char[count];
        for(int i=count-1;i>=0;i--){
            ch1[i]=(char)(num%10 + '0');
            num=num/10;
        }
        int temp=(int)Math.pow(2,count)-1;
        char ch2[] = new char[temp];
        Mapped_String(ch1,ch2,0,0);
    }
    public static void Mapped_String(char ch1[],char ch2[],int i,int j){
        if(i>ch1.length-1){
            String st=new String(ch2);
            System.out.println(st.substring(0,j));
            return;
        }
        int value = ch1[i] - '0';
        char ch = (char)(value + (int)('A') - 1);
        ch2[j]=ch;
        Mapped_String(ch1,ch2,i+1,j+1);
        if (i + 1 < ch1.length)
        {
            int value1 = ch1[i + 1] - '0';
            int number = (value * 10) + value1;
            if (number <= 26)
            {
                ch = (char)(number + (int)'A' - 1);
                ch2[j] = ch;
                Mapped_String(ch1,ch2,i + 2,j + 1);
            }
        }
    }
}
