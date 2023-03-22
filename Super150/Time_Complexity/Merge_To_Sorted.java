package Super150.Time_Complexity;

public class Merge_To_Sorted {
    public static void main(String[] args) {
        int arr[]={2,7,9,1,5};
        int ans[] = Merge(arr, 0, arr.length-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" "); // Array.sort;
        }
    }
    public static int[] Merge(int arr[] , int si , int ei){
        if(si == ei){
            int bs[]=new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid = (si+ei)/2;
        int fa[] = Merge(arr, si, mid);
        int sa[] = Merge(arr, mid+1 , ei);

        return Merge_Two_Sorted(fa,sa);
    }
    public static int[] Merge_Two_Sorted(int a[],int b[]) {
        int l1=a.length;
        int l2=b.length;
        int ans[] = new int[l1+l2];
        int flag1=0;
        int flag2=0;
        int i=0;
        while(flag1<l1 && flag2<l2){
            if(a[flag1]<b[flag2]){
                ans[i]=a[flag1];
                flag1++;
            }
            else{
                ans[i]=b[flag2];
                flag2++;
            }
            i++;
        }
        while(flag1<l1){
            ans[i]=a[flag1];
            flag1++;
            i++;
        }
        while(flag2<l2){
            ans[i]=b[flag2];
            flag2++;
            i++;
        }
        return ans;
    }
}
