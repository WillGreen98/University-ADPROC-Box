package flexbox;

import flexbox.boxtypes.BoxData;
import flexbox.boxtypes.Box;
import flexbox.ui.FlexBoxGui;
import java.awt.EventQueue;

/**
 * Entry point of the program
 * @author Group D4
 */
public class Main {
    public static void main(String[] args) {
        FlexBoxGui ui = new FlexBoxGui(new OrderSession());
    }
}
