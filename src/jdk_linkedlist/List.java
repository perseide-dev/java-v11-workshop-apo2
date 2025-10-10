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
    public void unShift(int value) {
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

    // Imprime los valores de la lista
    public void printListValues() {
        Node p = head;
        if (p == null) {
            System.out.println("Empty list");
            return;
        }
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getLink();
        }
    }
}
