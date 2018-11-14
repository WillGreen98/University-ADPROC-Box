package flexbox;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UserInterface {
    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    
    UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
        
                JTextField field = new JTextField("Enter");
        frame.add(field);
        JPanel p = new JPanel();
        p.add(field);
        frame.add(p);
        

    }
}
