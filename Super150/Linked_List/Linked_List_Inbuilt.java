package Super150.Linked_List;
import java.util.*;
public class Linked_List_Inbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.add(2,50);
        System.out.println(list);
    }
}
