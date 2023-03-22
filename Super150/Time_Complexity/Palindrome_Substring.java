package Super150.Time_Complexity;

public class Palindrome_Substring {
    public static void main(String[] args) {
        String str="abc";
        Sub(str);
    }
    public static void Sub(String str){
        //ODD
        int count=0;
        for(int axis=0;axis<str.length();axis++){
            for(int orbit=0;axis-orbit >=0 && axis+orbit<str.length();orbit++){
                if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)){
                    break;
                }
                count++;
            }
        }
        
        //EVEN
        for(double axis=0.5;axis<str.length();axis++){
            for(double orbit=0.5;axis-orbit >=0 && axis+orbit<str.length();orbit++){
                if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))){
                    break;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
