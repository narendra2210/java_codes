package Super150.Recursion;
import java.util.*;
public class Recursion_Combination_upto_n {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> parent = new ArrayList<>();
            List<Integer> child = new ArrayList<>();
            Combination(parent,child,n,k,0,1);
            return parent;
        }
        public static void Combination(List<List<Integer>> parent,List<Integer> child,int n,int k,int count,int i){
            if(count==k){
                parent.add(new ArrayList<>(child));
                return;
            }
            for(;i<=n;i++){
                child.add(i);
                Combination(parent,child,n,k,count+1,i+1);
                 child.remove(child.size()-1);
        }
    }
}