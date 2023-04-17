// Monu Bhaiya has a board of size M x N consisting of characters and a list of strings words, 
// print all words which are on the board in a sorted order .

// Each word must be constructed from letters of sequentially adjacent cells, where adjacent
//  cells are horizontally or vertically neighboring. The same letter cell may not be used 
//  more than once in a word.

// Input Format
// First Line contains 3 space-separated Integers M ,N and K(length of words list) .
// Next M Lines contains strings of length N .
// Next Line contains a list of words .

// Constraints
// 1 <= N,M <= 12
// 1 <= word.length <= 104
// 1 <= word[i].length <= 10

// Output Format
// print space-separated words which are on the board.

// Sample Input
// 4 4 5
// oaan 
// etae 
// ihkr 
// iflv  
// oath pea eat rain fifa
// Sample Output
// eat oath
// Explanation
// There are only two words "oath" and "eat" from the list which are also in the character board .

package Super150.Recursion;

import java.util.*;
public class Word_Search_2 {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int monu = scn.nextInt();
        int words = scn.nextInt();
        char ch[][]= new char[number][monu];
        // Input Taking
        for(int i=0;i<number;i++){
            String s = scn.next();
            for(int j=0;j<monu;j++){
                ch[i][j] = s.charAt(j) ;
            }
        }
        ArrayList<String> board =  new ArrayList<>();
        String str[]= new String[words];
        for(int i=0;i<words;i++){
            str[i] = scn.next();
        }

        // functioning
        for(int ii=0;ii<words;ii++){
            String thakur = str[ii];
            for(int jj=0; jj<number;jj++){
                for(int kk=0; kk<monu; kk++){
                    if(thakur.charAt(0) == ch[jj][kk]){
                        if(check(ch , jj , kk , thakur , 0)){
                            board.add(thakur);
                        }
                    }
                }
            }
        }
        Collections.sort(board);
        for(int i=0; i<board.size(); i++){
            System.out.print(board.get(i) + " ");
        }
    }
    public static boolean check(char kunwar[][], int row , int col , String ss, int index){
        //Base Case
        if(index == ss.length()){
            return true;
        }
        //Base Case
        if(row<0 || col<0 || col>=kunwar[0].length || row>=kunwar.length || kunwar[row][col] != ss.charAt(index)){
            return false;
        }
        kunwar[row][col] = '.' ;
        boolean answer = check(kunwar , row+1, col , ss , index+1) || check(kunwar , row-1 , col , ss , index+1) || check(kunwar , row , col+1 , ss , index+1) ||  check(kunwar, row , col-1 , ss , index+1);
        kunwar[row][col]= ss.charAt(index);
        return answer;
    }
}
