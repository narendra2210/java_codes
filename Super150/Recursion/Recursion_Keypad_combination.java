package Super150.Recursion;

public class Recursion_Keypad_combination {
    static String key[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        System.out.print("Total number of combination of keyPad : ");
        printKeyPad("12","");
    }
    public static void printKeyPad(String st,String ans){
        if(st.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=st.charAt(0);
        String press=key[ch-'0'];
        for(int i=0;i<press.length();i++){
            printKeyPad(st.substring(1),ans+press.charAt(i));
        }
    }
}
