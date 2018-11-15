package flexbox;

import flexbox.boxtypes.BoxData;
import flexbox.boxtypes.Box;
import flexbox.ui.UserInterface;
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flex Box App Started");
        
        EventQueue.invokeLater(() -> {
            UserInterface ui = new UserInterface();
        });
        
        Box test = new Box (
                new BoxData(1, 1, 1, 3, 1, true, true, true), 1);
        System.out.println(test.calculateCost());
    }
}
