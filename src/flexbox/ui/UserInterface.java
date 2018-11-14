package flexbox.ui;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
    
    private JLabel labelBoxGrade = new JLabel("Box Grade: ");
    private JComboBox comboBoxGrade = new JComboBox(new String[]{
        "1", "2", "3", "4", "5"
    });
    
    public UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);

        frame.add(mainPanel);
        

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        textBoxHeight.setColumns(10);
        textBoxLength.setColumns(10);
        textBoxWidth.setColumns(10);
        
        initComponents(labelBoxHeight, textBoxHeight);
        initComponents(labelBoxWidth, textBoxWidth);
        initComponents(labelBoxLength, textBoxLength);
        initComponents(labelBoxGrade, comboBoxGrade);
        
        
        frame.pack();
    }
    
    private void initComponents(JLabel label, JComponent comp) {
        mainPanel.add(label);
        mainPanel.add(comp);
    }
}
