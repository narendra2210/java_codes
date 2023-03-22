package Super150.Recursion;
import java.util.*;
public class Recursion_Array_perm {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> child = new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        perm(parent,child,arr,nums,0);
        System.out.println(parent);
    }
public static void perm(List<List<Integer>> parent,List<Integer> child,boolean arr[],int nums[],int count){
    if(count == nums.length){
        parent.add(new ArrayList<>(child));
        return;
    }
    for(int i=0;i<nums.length;i++){
        if(arr[i]==false){
            child.add(nums[i]);
            arr[i]=true;
            perm(parent , child , arr , nums , count+1);
            child.remove(child.size()-1);
            arr[i]=false;
        }
    }
}
}
