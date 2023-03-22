package Super150.Time_Complexity;

public class Quick_Sort_Algo {
    public static void main(String[] args) {
        int arr[] = {5 ,7 ,2 ,3 ,8 ,9 ,1, 4};   
        int l = arr.length;
        sort(arr, 0, l-1);
        System.out.println("The Quick sorted of array is -");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int Partition(int arr[] , int si ,int ei){
        int item = arr[ei];
        int pi =si ;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[pi];
        arr[pi] = arr[ei];
        arr[ei] = temp;
        return pi;
    }
    public static void sort(int arr[],int si ,int ei){
        if(si >= ei){
            return;
        }
        int pi = Partition(arr , si , ei);
        sort(arr, si, pi-1);
        sort(arr, pi+1, ei);
    }
}
