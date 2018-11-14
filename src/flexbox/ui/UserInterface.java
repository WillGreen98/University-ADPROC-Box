package flexbox.ui;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
    private JPanel leftPanel = new JPanel();
    private JPanel rightPanel = new JPanel();

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
    
    private JLabel labelBoxColourPrint = new JLabel("Box colour prints: ");
    private JComboBox comboBoxColourPrint = new JComboBox(new String[]{
        "None", "1 Colours", "2 Colours"
    });
    
    private JLabel labelBoxReinforce = new JLabel("Reinforce Boxes? ");
    private JCheckBox checkBoxReinforce = new JCheckBox();
    
    public UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);

        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        
        frame.add(mainPanel);
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);
        


        
        textBoxHeight.setColumns(10);
        textBoxLength.setColumns(10);
        textBoxWidth.setColumns(10);
        
        initComponents(labelBoxHeight, textBoxHeight);
        initComponents(labelBoxWidth, textBoxWidth);
        initComponents(labelBoxLength, textBoxLength);
        initComponents(labelBoxGrade, comboBoxGrade);
        initComponents(labelBoxColourPrint, comboBoxColourPrint);
        initComponents(labelBoxReinforce, checkBoxReinforce);
        
        
        
        
        frame.pack();
    }
    
    private void initComponents(JLabel label, JComponent comp) {
        leftPanel.add(label);
        rightPanel.add(comp);
    }
}
