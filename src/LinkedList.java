public class LinkedList {
    Node head;
    int size=0;
    void addFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    void addLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            size++;
            return;
        }
        Node cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }

    void addAtSpecificPosition(int val, int loc){
        Node node = new Node(val);
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (loc == 1){
            node.next = head;
            head = node;
            return;
        }
        Node cur = head;
        for(int i=1; i<=loc-2; i++){
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;

//        int count = 0;
//        Node prev = null;
//        Node cur = head;
//        while (cur!=null){
//            count++;
//            if(count == loc){
//                prev.next = node;
//                node.next = cur;
//                size++;
//            }
//            prev = cur;
//            cur = cur.next;
//        }
//        if(count < loc){
//            System.out.println("Location out of bound. Cannot add as the size is: " + size);
//        }
    }

    void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        size--;
    }

    void deleteLast(){
        if(head == null){
            return;
        }
        Node cur = head;
        while (cur.next.next != null){
            cur = cur.next;
        }
        cur.next = null;
        size--;
    }

    void  deleteAtEnd(){
        if (head == null){
            return;
        }
        Node prev = null;
        Node cur = head;
        while (cur.next!=null){
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        size--;
    }

    void deleteAtSpecificPosition(int loc){
        int count = 0;
        Node prev = null;
        Node cur = head;
        while (cur!=null){
            count++;
            if(count == loc){
                if (loc == 1){
                   head = head.next;
                   size--;
                }
                else {
                    prev.next = cur.next;
                    size--;
                }
            }
            prev = cur;
            cur = cur.next;
        }
        if(count < loc){
            System.out.println("Location out of bound. Cannot delete as the size is: " + size);
        }
    }

    void deleteByData(int data){
        if (head.data == data){
            head = head.next;
            return;
        }
        Node prev = null;
        Node cur = head;
        while (cur!=null){
            if (cur.data == data){
                prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    boolean search(int val){
        Node cur = head;
        int index = 0;
        boolean value=false;

        while (cur != null){
            index++;
            if(cur.data == val){
                System.out.println("Value " +cur.data +" found at Position: " +index);
                return true;
            }
            cur = cur.next;
        }
        System.out.println("Value not Found");
        return false;
    }

    void sortedInsertion(int val){
        Node node = new Node(val);
        if(head.data > val){
            node.next = head;
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data >= val){
               node.next = cur.next;
               cur.next = node;
               return;
            }
                cur = cur.next;
        }
            cur.next = node;
    }

    void sortedList(){
        if (head == null || head.next == null){
            return;
        }
        boolean swapped;
        int temp;
        do {
            swapped = false;
            Node cur = head;
            while (cur.next != null){
                if (cur.data > cur.next.data) {
                    temp = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                    swapped = true;
                }
                cur = cur.next;
            }
        }while (swapped);
    }
    void reverse(){
        Node prev = null;
        Node cur = head;

        while (cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    void deleteDuplicates(int value) {
        while (head != null && head.data == value){
            head = head.next;
        }

        Node previous = null;
        Node current = head;

        while (current != null){

            if(current.data == value) {
                previous.next = current.next;
                current = current.next;
            }
            else {
                previous = current;
                current = current.next;
            }
        }

    }

    void display(){
        if(head == null){
            System.out.println("list empty");
            return;
        }
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("Null");
    }

    int getSize(){
        return size;
    }

}
