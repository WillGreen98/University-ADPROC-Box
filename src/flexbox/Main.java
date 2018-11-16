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
        Box test = new Box (
                new BoxData(1, 1, 1, 3, 1, true, true, true), 1);
        System.out.println(test.calculateCost());
    }
}
