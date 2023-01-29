package Super150.Recursion;

public class Recursion_permuation1 {
    public static void main(String[] args) {
        String st="abc";
        System.out.println("Total  number of combinations : ");
        permutation(st,"");
    }
    public static void permutation(String st,String ans){
        if(ans.length()==3){
            System.out.print(ans+" ");
            return;
        }
        // With Repetition
        for(int j=0;j<st.length();j++){
            String s1=st.substring(0,j+1);
            String s2=st.substring(j+1);
            permutation(s1+s2,ans+st.charAt(j));
        }
    }
}
