package Super150.Time_Complexity;

public class Merge_Sort {
    public static void main(String[] args) {
        int a[]={2,3,5,7,8,9};
        int b[]={1,3,5,7,11,13,15};
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
        System.out.println("merged array --- ");
        for(i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
