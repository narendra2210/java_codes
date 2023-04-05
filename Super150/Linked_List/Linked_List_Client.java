package Super150.Linked_List;

public class Linked_List_Client {
    public static void main(String[] args)throws Exception {
        Linked_List ll=new Linked_List();
        ll.Addfirst(10);
        ll.Addfirst(20);
        ll.Addfirst(30);
        ll.Addfirst(40);
        ll.Display();
        ll.Addlast(100);
        ll.Addlast(200);
        ll.Display();
        System.out.println(ll.GetNode(4).val);

        ll.Add_At_Index(10, 2);
        ll.Display();

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getatIndex(2));
    }
}