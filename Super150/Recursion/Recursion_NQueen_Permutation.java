package Super150.Recursion;

public class Recursion_NQueen_Permutation {
    public static void main(String[] args){
        int n=4;    //Number of boxes
        int tq=2;   //queens
        boolean board[]=new boolean[n];
        System.out.println("Total number of arrangements : ");
        Permutation(board,tq,0,"");
    }                  
    public static void Permutation(boolean board[],int tq,int qpsf,String ans){
        if(qpsf==tq){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Permutation(board,tq,qpsf+1,ans+"B"+i+"Q"+qpsf);
                board[i]=false;                    // Here , Backtraking is used when we have to undo before using recursion(we r doing this forcefully)
            }
        }
    }
}
