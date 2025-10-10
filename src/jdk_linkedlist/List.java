package jdk_linkedlist;

public class List {

    private Node head;

    public List() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Inserta un nodo al inicio
    public void shift(int value) {
        Node x = new Node(value);
        if (head != null) {
            x.setLink(head);
        }
        head = x;
    }

    // Inserta un nodo al final
    public void push(int value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
        } else {
            Node p = head;

            while (p.getLink() != null) {
                p = p.getLink();
            }
            p.setLink(x);
        }
    }

    public void insert(int value, int position) {
        if (position < 0) {
            position = 0; // normaliza negativos
        }
        Node x = new Node(value);

        if (head == null || position == 0) {
            x.setLink(head);
            head = x;
            return;
        }

        Node p = head;
        int index = 0;
        while (p.getLink() != null && index < position - 1) {
            p = p.getLink();
            index++;
        }

        x.setLink(p.getLink());
        p.setLink(x);
    }

    public void unShift() {
        Node h = head;

        if (h == null) {

        } else {
            head = h.getLink();
        }
    }

    public void pop() {
        if (head == null) {

        } else {
            Node prev = head;
            Node curr = head.getLink();
            while (curr.getLink() != null) {
                prev = curr;
                curr = curr.getLink();

            }
            prev.setLink(null);
        }

    }

    // Imprime los valores de la lista
     public void printListValues() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node p = head;
        while (p != null) {
            System.out.println(p.getValue());
            System.out.println("----------------");
            p = p.getLink();
        }
    }
    
}
