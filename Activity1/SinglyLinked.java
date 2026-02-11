
public class SinglyLinked{
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertAtBeginning(23);
        s1.insertAtBeginning(24);
        s1.insertAtLast(76);
        s1.insertAtLast(45);
        s1.traverse();
        s1.reverse();
        s1.traverse();
    }
}

class SinglyLinkedList {
    Node head;
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        newNode.next= head;
        head = newNode;
    }

    void insertAtLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Reverse (Challenge)
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next= null;
    }
}
