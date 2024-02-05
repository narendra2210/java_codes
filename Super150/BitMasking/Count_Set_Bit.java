package Super150.BitMasking;

public class Count_Set_Bit {
    public static void main(String[] args) {

        //Approach 1
        int n = 67;
        int counter = 0;
        for(int i = 0 ; i < 32 ; i++){
            if((n & 1) == 1){
                counter++;
            }
            n = (n >> 1);
        }
        System.out.println(counter);

        //Approach 2
        int n1 = 67;
        int ans = 0;
        while(n1 > 0){
            if((n1 & 1)  == 1){
                ans++;
            }
            n1 = n1 >> 1;
        }
        System.out.println(ans);

        //Approach 3
        int n2 = 67;
        int ans1 = 0;
        while(n2 > 0){
            n2 = (n2 & (n2 - 1));
            ans1++;
        }
        System.out.println(ans1);

    }
}
