public class Deleting_Duplicates_Main {
    public static void main(String[] args) {
        DeletingDuplicates dd = new DeletingDuplicates();
        dd.add(2);
        dd.add(2);
        dd.add(2);
//        dd.add(3);
//        dd.add(2);
//        dd.add(21);
        dd.add(2);
        dd.add(2);
        dd.add(2);
//        dd.add(1);
        dd.add(2);
        dd.add(2);
        dd.add(2);
        dd.display();
        dd.delete(2);
        dd.display();
    }
}
