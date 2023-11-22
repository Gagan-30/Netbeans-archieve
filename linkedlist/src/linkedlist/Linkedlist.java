package linkedlist;

public class Linkedlist {

    Node head;   // Reference to the head of the linked list
    Node tail;   // Reference to the tail of the linked list
    int index;   // Index counter

    Linkedlist() {
        head = null;
        tail = null;
        index = 0;
        System.out.println("List declared\n");
    }

    public boolean isEmpty() {
        return head == null;   // Check if the linked list is empty
    }

    public void add(String data) {
        if (isEmpty()) {
            head = new Node(data);   // Create the first node
            tail = head;
        } else {
            tail.next = new Node(data);   // Create a new node and add it after the tail
            tail = tail.next;   // Update the tail to the new node
        }
    }

    public void insert(int index, String data) {
        if (isEmpty()) {
            head = new Node(data);   // If the list is empty, create the first node
        } else if (index == 0) {
            Node temp = head;   // Insert at the beginning of the list
            head = new Node(data);
            head.next = temp;
        } else {
            Node current = head;
            for (int i = 0; i < index - i; i++) {
                current = current.next;   // Traverse to the node at the given index
            }
            Node temp = current.next;
            current.next = new Node(data);   // Create a new node and insert it in between current and temp
            current.next.next = temp;
        }
    }

    public String removeHead() {
        if (isEmpty()) {
            return "error";   // If the list is empty, return an error
        } else {
            String data = head.data;   // Store the data of the current head
            head = head.next;   // Move the head to the next node
            return data;   // Return the removed data
        }
    }

    public String removeAt(int index) {
        if (isEmpty()) {
            return "error";   // If the list is empty, return an error
        } else if (index == 0) {
            String data = head.data;   // If the index is 0, remove the head node
            head = head.next;
            return data;   // Return the removed data
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;   // Traverse to the node before the given index
            }
            String data = current.next.data;   // Store the data of the node to be removed
            current.next = current.next.next;   // Remove the node by updating the references
            if (current.next == null) {
                tail = current;   // If the tail node is removed, update the tail reference
            }
            return data;   // Return the removed data
        }
    }

    public void display() {
        if (!isEmpty()) {
            Node current = head;
            do {
                System.out.println(current.data);   // Traverse the list and print each node's data
                current = current.next;
            } while (current != null);
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.removeHead();
        list.removeAt(4);
        list.insert(3, "x");
        list.display();
        System.out.println("\n");
    }

}
