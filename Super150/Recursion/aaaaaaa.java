package Super150.Recursion;

public class aaaaaaa {
    import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String[] search = {"kartik" , "sneha" , "deepak" , "arnav" , "shikha" , "palak" , "utkarsh" , "divyam" , "vidhi" , "sparsh" , "akku"};
		ArrayList<String> list = new ArrayList<>();
		combinations(st , "" , list);
		for(int i = search.length-1 ; i >= 0 ; i--){
			String str = search[i];
			for(String j : list){
				if(isPresent(str , j)){
					System.out.println(str);
					break;
				}
			}
		}
		
    }

	static boolean isPresent(String st , String sp){
		int s = 0;
		int e = sp.length();
		while(e <= st.length()){
			String str = st.substring(s , e);
			if(str.equals(sp)){
				return true;
			}
			s++;
			e++;
		}

		return false;
	}

	static String[] keypad = {"" , ".+@$" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

	static void combinations(String digits , String ans , ArrayList<String> list){
		if(digits.length() == 0){
			list.add(ans);
			return;
		}

		int index = digits.charAt(0) - '0';
		String s = keypad[index];
		for(int i = 0 ; i < s.length() ; i++){
			combinations(digits.substring(1) , ans+s.charAt(i) , list);
		}
	}
}
}
