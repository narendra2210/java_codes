package Super150.Linked_List;

public class Linked_List {
    public class Node{
        int val;     //(value of node)
        Node next;   //(next address)
    }
    private Node head; //(first node)
    private int size; //(total no of nodes)
    private Node tail; //(last node and after last node there is null)  

    public void Addfirst(int item){
        Node nn=new Node();
        nn.val=item; //1,2,3
        if(size==0){
            this.head=nn; //1k head
            this.tail=nn; //1k    //this is a keyword use to access the variable of class not function
            this.size++;
        }
        else{
            nn.next=head; //1k  2k
            this.head=nn; //2k head   3k head
            this.size++;
        }
    }

    public void Display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(".");
    }

    public void Addlast(int item){
        if(this.size==0){
            Addfirst(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public Node GetNode(int k)throws Exception{
         if(k<=0 || k>=size){
            throw new Exception("Bklol");
         }
         Node temp = head;
         for(int i=0;i<=k;i++){
            temp = temp.next;
         }
         return temp;
    }

    public void Add_At_Index(int item , int k)throws Exception{
        if(k<=0 || k>=size){
            throw new Exception("Bklol");
         }
         if(k==0){
            Addfirst(item);
         }
         else if(k==size){
            Addlast(item);
         }
         else{
            Node nn =  new Node();
            nn.val = item;
            Node k_1th = GetNode(k-1);
            Node Kth = k_1th.next;
            k_1th.next = nn;
            nn.next = Kth;
            size++;
         }
    }

    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        return tail.val;
    }

    public int getatIndex(int k)throws Exception{
        return GetNode(k).val;
    }

    public int removeFirst()throws Exception{
        if(size == 0){
            throw new Exception("Linked list is Empty");
        }
        int rv = head.val;
        if(size == 1){
           head = null;
           tail = null;
           size--;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
        return rv;
    }

    public int removeLast()throws Exception{
        if(size == 0){
            throw new Exception("Linked list is Empty");
        }
        int rv = tail.val;
        if(size == 1){
          return removeFirst();
        }
        else{
            Node n = GetNode(size-1);
            tail = n;
            tail.next = null;
            size--;
        }
        return rv;
    }
}