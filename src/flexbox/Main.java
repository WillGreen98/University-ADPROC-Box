package flexbox;

import flexbox.boxtypes.BoxData;
import flexbox.boxtypes.Box;
import flexbox.ui.FlexBoxGUI;
import flexbox.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flex Box App Started");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlexBoxGUI().setVisible(true);
            }
        });

        UserInterface ui = new UserInterface();
        Box test = new Box (
                new BoxData(1, 1, 1, 3, 1, true, true, true), 1);
        System.out.println(test.calculateCost());
    }
}
