import java.util.Scanner;

public class LL {
   Node head;
   private int size;
   LL(){
       this.size=0;
   }

    public void addFirst(int data){
        if(data>=1 && data <=50 ) {
           Node newNode = new Node(data);

           if (head == null) {
               head = newNode;
               return;
           }
           newNode.next = head;
           head = newNode;
       }
        else {
            System.out.println("Number should be in between 1 to 50");
        }
    }

    public void addLast(int data) {
       if(data>=1 && data <=50 ) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }
       else {
           System.out.println("Number should be in between 1 to 50");
       }

    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node previous = null;
        Node current = head.next;
        while (current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
    }

    public void deleteAtPosition(int loc){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node previous = null;
        Node current = head;
        int count=0;
        while (current != null){
            count++;
            if(count == loc){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public void deleteByData(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node previous = null;
        Node current = head;
        int count=0;
        while (current != null){
            count++;
            if(current.data == data){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public void delete(){
        Node previous = null;
        Node current= head;
        while(current!= null){
            if(current.data > 25){
                previous.next = current.next;
            }
            previous = current;
            current=current.next;
        }
    }

    public void sortedInsertion(int data){
       Node node = new Node(data);
        if(head == null){
            head = node;
            size++;
            return;
        }

        if (head.next == null){
            if (node.data > head.data){
                head.next = node;
            }
            else {
                node.next = head;
                head = node;
            }
        }

        Node previous = head;
        Node current = head.next;

        while (current != null){

            if(node.data > previous.data && node.data < current.data){
                previous.next = node;
                node.next = current;
            }

            previous = previous.next;
            current = current.next;
        }
    }

    public void insert(int data, int loc){
        Node node = new Node(data);
        if(head == null){
            head = node;
            size++;
            return;
        }

        if(head.next == null){
            head.next = node;
            return;
        }

        Node previous = head;
        Node current = head.next;
        int NodeCount = 0;
        while (current.next != null){
            NodeCount++;
            previous = previous.next;
            current = current.next;
            if(NodeCount == loc){
                node.next = current;
                previous.next = node;
            }
        }
    }

    void arrange() {
        if (head == null || head.next == null) {
            return;
        }
        int temp;

        for (int i = 0; i < size - 1; i++) {
            Node current = head; // Reset current to head for each pass of the outer loop
            for (int j = 0; j < size - i - 1; j++) {
                if (current.data > current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }

        Node previous = head;
        Node current = head.next;
        while (current != null){
            Node next = current.next;
            current.next=previous;

            previous = current;
            current = next;
        }
        head.next = null;
        head = previous;
    }

    public int searchNumber(int data){
       if (head == null){
           System.out.println("List is empty");
           return -1;
       }
       int index = 0;
       Node curr = head;
       while (curr != null) {
           if (curr.data == data)
               return index;

          curr = curr.next;
           index++;
       }
           return -1;
    }

    public int getSize(){
       return size;
    }

    void swap(){
        if(head == null || head.next == null){
            return;
        }
       Node prev = head;
       Node curr = head.next;
       while (curr != null){
           Node next = curr.next;
           Node temp = curr;
           curr = prev;
           prev = temp;

           next = prev;
           next.next = curr;
       }
    }
}
