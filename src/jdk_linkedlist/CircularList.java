package jdk_linkedlist;

public class CircularList {

    private Node head;

    public CircularList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    
    public void insertAtFront(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.setLink(newNode);
            head = newNode;
        } else {
            Node tail = head;
            while (tail.getLink() != head) {
                tail = tail.getLink();
            }
            newNode.setLink(head);
            tail.setLink(newNode);
            head = newNode;
        }
    }

    
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.setLink(newNode);
            head = newNode;
        } else {
            Node tail = head;
            while (tail.getLink() != head) {
                tail = tail.getLink();
            }
            tail.setLink(newNode);
            newNode.setLink(head);
        }
    }

    
    public void insertInto(int value, int position) {
        Node newNode = new Node(value);

        if (head == null || position <= 0) {
            insertAtFront(value);
            return;
        }

        Node p = head;
        int index = 0;

        while (p.getLink() != head && index < position - 1) {
            p = p.getLink();
            index++;
        }

        newNode.setLink(p.getLink());
        p.setLink(newNode);
    }

    
    public void deleteAtFront() {
        if (head == null) {
            return;
        }

        if (head.getLink() == head) {
            head = null;
            return;
        }

        Node tail = head;
        while (tail.getLink() != head) {
            tail = tail.getLink();
        }

        head = head.getLink();
        tail.setLink(head);
    }

    
    public void deleteAtEnd() {
        if (head == null) {
            return;
        }

        if (head.getLink() == head) {
            head = null;
            return;
        }

        Node prev = null;
        Node curr = head;
        while (curr.getLink() != head) {
            prev = curr;
            curr = curr.getLink();
        }

        prev.setLink(head);
    }

    
    public void delete(int value) {
        if (head == null) {
            return;
        }

        
        if (head.getLink() == head && head.getValue() == value) {
            head = null;
            return;
        }

        
        if (head.getValue() == value) {
            Node tail = head;
            while (tail.getLink() != head) {
                tail = tail.getLink();
            }
            head = head.getLink();
            tail.setLink(head);
            return;
        }

        
        Node prev = head;
        Node curr = head.getLink();
        while (curr != head) {
            if (curr.getValue() == value) {
                prev.setLink(curr.getLink());
                break;
            }
            prev = curr;
            curr = curr.getLink();
        }
    }

    
    public void printListValues() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node p = head;
        do {
            System.out.println(p.getValue());
            System.out.println("----------------");
            p = p.getLink();
        } while (p != head);
    }
}
