import java.util.LinkedList;

public class Built_in_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);
        System.out.println(list.get(6));
    }
}
