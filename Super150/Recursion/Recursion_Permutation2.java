package Super150.Recursion;

public class Recursion_Permutation2 {
    public static void main(String[] args) {
        String st="abc";
        System.out.print("Total  number of combinations : ");
        permutation(st,"");
    }
    public static void permutation(String st,String ans){
        if(ans.length()==3){
            System.out.print(ans+" ");
            return;
        }
        // Without Repetition
        for(int j=0;j<st.length();j++){
            String s1=st.substring(0,j);
            String s2=st.substring(j+1);
            permutation(s1+s2,ans+st.charAt(j));
        }
    }
}
