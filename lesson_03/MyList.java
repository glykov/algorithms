public class MyList {
    private Node head;

    public MyList() {
        head = null;
    }

    public MyList(int value) {
        head = new Node(value);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public Node remove() {
        Node tmp = head;
        head = head.next;
        return tmp;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node result = null;
        while (head.next != null) {
            Node node = head;
            head = head.next;
            node.next = result;
            result = node;
        }
        head.next = result;
    }
}
