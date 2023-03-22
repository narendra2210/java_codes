package Super150.Time_Complexity;

public class Place_last_number_Array {
    public static void main(String[] args) {
        int arr[] = {5 ,7 ,2 ,3 ,8 ,9 ,1, 4};   
        int l = arr.length;
        int ans = Partition(arr, 0, arr.length-1);
        System.out.println("The partition of array is -");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int Partition(int arr[] , int si ,int ei){
        int item = arr[ei];
        int pi = 0 ;
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
}
