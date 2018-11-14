package flexbox;

import flexbox.boxes.*;
import flexbox.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flex Box App Started");

        BitMask bm = new BitMask();
        UserInterface ui = new UserInterface();
        Box test = new Box (1, 1, 1, 3, 1, true, true, true, 1);
        System.out.println(test.calculateCost());
    }
}
