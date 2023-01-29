package Super150.Recursion;

public class Recursion_Dice {
    public static void main(String[] args) {
        int n=4;
        String ans="";
        combination(0,n,ans);
    }
    public static void combination(int src,int des,String ans){
        if(src==des){
            System.out.print(ans+" ");
            return;
        }
        if(src>des){
            return;
        }
        // combination(src+1,des,ans+1);
        // combination(src+2,des,ans+2);
        // combination(src+3,des,ans+3);
        for(int i=1;i<=3;i++){
            combination(src+i,des,ans+i);
        }
    }
}
