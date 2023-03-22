package Super150.Recursion;

public class RecursionArray {
    public static void main(String[] args) {
        int arr[]={2,3,7,2,5,7,9,7};
        int item=7;
        int len=arr.length;
        System.out.println(index(arr,item,len-1));
    }
    public static int index(int arr[],int item,int i){
        if(i==0)
           return -1;
        if(arr[i]==item)
           return i;
        return index(arr,item,i-1);
    }
}
