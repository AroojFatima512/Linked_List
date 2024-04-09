public class DeletingDuplicates {
        Node head;
        void add(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                return;
            }
            Node previous=head;
            Node cur = head.next;
            while (cur!=null) {
                previous=previous.next;
                cur=cur.next;
            }
            cur=newNode;
            previous.next=cur;

        }

        void display(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node cur = head;
            while (cur!=null){
                System.out.print(cur.data+ "-> ");
                cur = cur.next;
            }
            System.out.println("NULL");
        }

        void delete(int value) {
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
    }

