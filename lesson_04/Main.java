import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        Scanner in = new Scanner(System.in);

        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int value = Integer.parseInt(input);
            tree.add(value);
            System.out.println("added");
        }
    }
}
