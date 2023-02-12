package Super150.Recursion;

public class Recursion_Array_Arrangement {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d'};
        Array_Arrangement(ch,"",2,0);
    }
    public static void Array_Arrangement(char ch[],String ans,int n,int i){
        if(ans.length()==n){
            System.out.print(ans+" ");
            return;
        }
        for(;i<ch.length;i++){
           Array_Arrangement(ch, ans+ch[i], n, i+1);
        }
        


        // 2nd way
        // if(ch.length==i){
        //     return;
        // }
        // char chh=ch[i];
        // Array_Arrangement(ch, ans+chh, n, i+1);
        // Array_Arrangement(ch, ans, n, i+1);
    }
}
