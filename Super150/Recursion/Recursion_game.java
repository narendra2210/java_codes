package Super150.Recursion;
import java.util.*;
public class Recursion_game {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sn=new Scanner(System.in);
        int k=sn.nextInt();
        printpathsall(k,0,0,"");
        System.out.println("\n"+count);
    }
   static int count=0;
    public static void printpathsall(int n,int rwo,int clo,String finalstr){
        //base case
        if(rwo==n-1&& clo==n-1){
            System.out.print(finalstr+"{"+rwo+"-"+clo+"} ");
            count=count+1;
            return;
        }
        if(rwo>=n || clo>=n){
            return;
        }
        //knight move down
        printpathsall(n,rwo+2,clo+1,finalstr +"{"+rwo+"-"+clo+"}K");
         //knight move right
        printpathsall(n,rwo+1,clo+2,finalstr +"{"+rwo+"-"+clo+"}K");
         //rook right move & right
        if(clo==0 || clo==n-1 || rwo==0 || rwo==n-1){
            for(int m=clo+1;m<=n;m++){
                printpathsall(n,rwo,m,finalstr +"{"+rwo+"-"+clo+"}R");
            }
            for(int m=rwo+1;m<=n;m++){
                printpathsall(n,m,clo,finalstr +"{"+rwo+"-"+clo+"}R");
            }
        }
        //bishop
        if(rwo==clo || rwo+clo==n-1){
            for(int r1=rwo+1,c1=clo+1; r1<=n && c1<=n; r1++,c1++ ){
                printpathsall(n,r1,c1,finalstr +"{"+rwo+"-"+clo+"}B");
            }
        }
    }
}