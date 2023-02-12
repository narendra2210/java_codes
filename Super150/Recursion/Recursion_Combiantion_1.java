package Super150.Recursion;
import java.util.*;
public class Recursion_Combiantion_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int candidates[]=new int[n];
        for(int i=0;i<n;i++){
            candidates[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> child = new ArrayList<>();
        combinationSum2(candidates,target,parent,child);
        System.out.println(parent);
    }
    public static void combinationSum2(int[] candidates, int target,List<List<Integer>> parent,List<Integer> child) {
        Arrays.sort(candidates);
        Combination_Coin(parent,child,candidates,target,0,0);
    }
    public static void Combination_Coin(List<List<Integer>> parent,List<Integer> child,int candidates[],int target,int sum,int i){
        if(sum==target){
            parent.add(new ArrayList<>(child));
        }
        if(sum>target){
            return;
        }
        for(;i<candidates.length;i++){
            sum=sum+candidates[i];
            child.add(candidates[i]);
            Combination_Coin(parent,child,candidates,target,sum,i+1);
            sum=sum-candidates[i];
            child.remove(child.size()-1);
        }
    }
}
