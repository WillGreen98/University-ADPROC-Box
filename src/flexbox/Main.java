package flexbox;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        Box test = new Box (1, 1, 1, 3, 1, true, true, true, 1);
        System.out.println(test.calculateCost());
    }
}
