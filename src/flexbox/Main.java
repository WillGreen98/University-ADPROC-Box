package flexbox;

import flexbox.ui.GUI;
import java.awt.EventQueue;

/**
 * Entry point of the program
 * @author Group D4
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new GUI(new OrderSession()).setVisible(true));
    }
}
