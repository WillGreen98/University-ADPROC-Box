package flexbox.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInterface {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    private JPanel mainPanel = new JPanel();

    private JLabel     labelBoxLength = new JLabel("Box Length: ");
    private JTextField textBoxLength = new JTextField();

    private JLabel     labelBoxWidth = new JLabel("Box Width: ");
    private JTextField textBoxWidth = new JTextField();

    private JLabel     labelBoxHeight = new JLabel("Box Height: ");
    private JTextField textBoxHeight = new JTextField();
    
    public UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
        
        frame.add(mainPanel);
        
        initLabeledTextField(labelBoxLength, textBoxLength);
    }
    
    private void initLabeledTextField(JLabel label, JTextField field) {
        field.setColumns(10);
        mainPanel.add(labelBoxLength);
        mainPanel.add(textBoxLength);
    }
}
