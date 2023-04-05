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

}