package Super150.Recursion;
public class Recursion_Permutation3 {
        public static void main(String[] args) {
            String str="abca";
            String ans="";
            System.out.print("Total number of permutation : ");
            permutation(str, ans);
        }
        public static void permutation(String str,String ans){
            if(str.length()==0){
                System.out.print(ans+" ");
                return;
            }
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                boolean flag=true;
                for(int j=i+1;j<str.length();j++){    //condition to remove repeatation
                    if(str.charAt(j)==ch){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    String s1=str.substring(0, i);
                    String s2=str.substring(i+1);
                    permutation(s1+s2, ans+ch);
                }
            }
        }
    }
