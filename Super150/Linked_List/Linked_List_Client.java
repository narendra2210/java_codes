package Super150.Linked_List;

public class Linked_List_Client {
    public static void main(String[] args) throws Exception {
        Linked_List ll = new Linked_List();
        ll.addfrist(10);
        ll.addfrist(20);
        ll.addfrist(30);
        ll.Display();
        ll.addlast(40);
        ll.addlast(50);
        ll.addlast(60);
        ll.addlast(70);
        ll.addlast(80);
        // ll.Display();
        // System.out.println(ll.getfirst());
        // System.out.println(ll.getlast());
        // System.out.println(ll.removeFisrt());
        // ll.Display();
        // System.out.println(ll.removelast());
        ll.Display();
        System.out.println(ll.removeatindex(3));
        ll.Display();
        ll.addatindex(-90, 7);
        ll.Display();

    }
}