package Super150.String;

public class Decode_String_At_Index {
    public static void main(String[] args) {
        System.out.println(decodeAtIndex("ha22" , 5));
    }
    public static String decodeAtIndex(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( Character.isAlphabetic(ch)){
                sb.append(ch);
            }
            else{
                int iteration = (int)(ch - '0');
                String a = sb.toString();
                while(iteration > 1){
                    sb.append(a);
                    iteration--;
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString().substring(k-1 , k);
    }
}
