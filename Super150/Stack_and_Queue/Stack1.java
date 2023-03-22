package Super150.Stack_and_Queue;

public class Stack1 {
    private int[] arr;
    int tos;

    public Stack1(){
        arr = new int[5];
        tos=-1;
    }

    //CONSTRUCTOR
    public Stack1(int n){
        arr = new int[n];
        tos=-1;
    }

    //EMPTY
    public boolean isEmpty(){
        return tos == -1;
    }
    
    //FULL
    public boolean isFull(){
        return tos == arr.length-1;
    }

    //PUSH
    public void Push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack full h bro");
        }
        tos++;
        arr[tos] = item;
    }
    
    //SIZE
    public int size(){
        return tos+1;
    }
    
    //POP
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty h bro");
        }
        int x = arr[tos];
        tos--;
        return x;
    }
    
    //PEEK
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty h bro");
        }
        int x = arr[tos];
        return x;
    }
    
    //DISPLAY
    public void Display(){
        for(int i=0;i<=tos;i++){
            System.out.println(arr[i] +  "->");
        }
        System.out.print(".");
    }
}
