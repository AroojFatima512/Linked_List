import java.util.Scanner;

public class LL_Main {
    public static void main(String[] args) {
        LL list = new LL();
//     list.print();
        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = s.nextInt();
//        int d = s.nextInt();
//        int num = s.nextInt();

        list.addLast(2);
        list.addLast(8);
        list.addLast(6);
        list.addLast(1);

        list.print();
//     int index = list.searchNumber(num);
//        System.out.println(index);


//        int e = s.nextInt();
//        list.sortedInsertion(e);
//        list.print();


//        list.insert(12, 3);
//        list.print();

//        list.arrange();
//        list.print();

//        list.deleteAtPosition(5);
////        list.sortedInsertion(4);
//        list.print();
//
//        list.deleteByData(4);
//        list.print();
//
//        list.reverse();
//        list.print();
//
//        list.delete();
//        list.print();

//        list.swap();
        list.arrange();
        list.print();
//     list.addFirst("am");
//     list.addFirst("I");
//     list.print();
//     list.addLast("Arooj");
//     list.print();
//        System.out.println(list.getSize());
//     list.deletefirst();
//     list.print();
//     list.deleteLast();
//     list.print();
//        System.out.println(list.getSize());
    }
}
