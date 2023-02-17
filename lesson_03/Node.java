public class Node {
    int data;
    Node next;

    public Node(int value) {
        data = value;
        next = null;
    }

    public void displayNode() {
        System.out.print(data + " ");
    }
}
