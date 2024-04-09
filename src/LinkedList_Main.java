public class LinkedList_Main {
    public static void main(String[] args) {
        LinkedList f = new LinkedList();
//        f.addFirst(5);
//        f.addFirst(4);
//        f.addFirst(2);
//        f.addFirst(1);
        f.addLast(1);
        f.addLast(2);
        f.addLast(6);
        f.addLast(4);
        f.addLast(7);
        f.display();
        System.out.println(f.getSize());
        f.addAtSpecificPosition(9, 5);
//        f.addAtSpecificPosition(8, 2);
//        f.display();
//        f.deleteByData(1);
//        f.display();
//        f.sortedInsertion(5);
//        f.display();
//        f.reverse();
//        f.display();
//        f.sortedList();
        f.display();
//        f.deleteAtSpecificPosition(1);
//        f.display();
//        System.out.println(f.getSize());
        f.addAtSpecificPosition(11, 1);
        f.display();
//        f.search(9);
//        System.out.println();
//        f.deleteFirst();
//        f.display();
//        f.deleteLast();
//        f.display();
//        f.deleteAtEnd();
//        f.display();
    }
}
