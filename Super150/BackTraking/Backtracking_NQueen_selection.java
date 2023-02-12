package Super150.BackTraking;

public class Backtracking_NQueen_selection {
    public static void main(String[] args){
        int n=4;    //Number of boxes
        int total_queens=2;   //queens
        boolean board[]=new boolean[n];
        System.out.println("Total number of arrangements : ");
        Permutation(board,total_queens,0,"",0);
    }                  
    public static void Permutation(boolean board[],int total_queens,int qpsf,String ans,int i){
        if(qpsf==total_queens){
            System.out.print(ans+" ");
            return;
        }
        for(;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Permutation(board,total_queens,qpsf+1,ans+"B"+i+"Q"+qpsf,i+1);
                board[i]=false;                    // Here , Backtraking is used when we have to undo before using recursion(we r doing this forcefully)
            }
        }
    }
}