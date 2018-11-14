package flexbox;

import javax.swing.JFrame;
import javax.swing.JButton;

class UserInterface {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    
    UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
    }
}
