public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.display();

        list.reverse();

        list.display();
    }
}
