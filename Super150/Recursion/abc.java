package Super150;
import java.util.*;
public class abc {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        snake_ladder(0,n,"",m);
        System.out.print("\n"+count(0,n,"",m));
    }
    public static void snake_ladder(int src,int des,String ans,int m){
        if(src==des){
            System.out.print(ans+" ");
            return;
        }
        if(src>des){
            return;
        }
        for(int i=1;i<=m;i++){
            snake_ladder(src+i,des,ans+i,m);
        }
    }
    public static int count(int src,int des,String ans,int m){
        int x=0;
        if(src==des){
            return 1;
        }
        if(src>des){
            return 0;
        }
        for(int i=1;i<=m;i++){
            x=x+count(src+i,des,ans+i,m);
        }
        return x;
    }
}
