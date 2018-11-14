package flexbox.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserInterface {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    
    private JPanel mainPanel = new JPanel();
    private JPanel inputPanel = new JPanel();

    private JLabel     labelBoxLength = new JLabel("Box Length: ");
    private JTextField textBoxLength = new JTextField();

    private JLabel     labelBoxWidth = new JLabel("Box Width: ");
    private JTextField textBoxWidth = new JTextField();

    private JLabel     labelBoxHeight = new JLabel("Box Height: ");
    private JTextField textBoxHeight = new JTextField();
    
    private JLabel labelBoxGrade = new JLabel("Box Grade: ");
    private JComboBox<String> comboBoxGrade = new JComboBox<>(new String[] {
        "1", "2", "3", "4", "5"
    });
    
    private JLabel labelBoxColourPrint = new JLabel("Box colour prints: ");
    private JComboBox<String> comboBoxColourPrint = new JComboBox<>(new String[]{
        "None", "1 Colours", "2 Colours"
    });
    
    private JLabel labelBoxReinforce = new JLabel("Reinforce Boxes? ");
    private JCheckBox checkBoxReinforce = new JCheckBox();
    
    private JLabel labelCornerReinforcement = new JLabel("Reinforce Boxes? ");
    private JCheckBox checkBoxCornerReinforcement = new JCheckBox();
    
    private JLabel labelSealableTop = new JLabel("Reinforce Boxes? ");
    private JCheckBox checkBoxSealableTop = new JCheckBox();

    private JButton submitButton = new JButton("SUBMIT");

    public UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        
        
        frame.add(mainPanel);
        mainPanel.add(new JLabel("FLEX BOX")); 
        mainPanel.add(inputPanel);

        textBoxHeight.setColumns(10);
        textBoxLength.setColumns(10);
        textBoxWidth.setColumns(10);
        
        initComponents(labelBoxHeight, textBoxHeight);
        initComponents(labelBoxWidth, textBoxWidth);
        initComponents(labelBoxLength, textBoxLength);
        initComponents(labelBoxGrade, comboBoxGrade);
        initComponents(labelBoxColourPrint, comboBoxColourPrint);
        initComponents(labelBoxReinforce, checkBoxReinforce);
        initComponents(labelCornerReinforcement, checkBoxCornerReinforcement);
        initComponents(labelSealableTop, checkBoxSealableTop);

        //---------------------------------------------------

        submitButton.addActionListener(event -> System.out.println("Submit Button Pressed"));

        mainPanel.add(submitButton);
        
        frame.pack();
    }

    private void initComponents(JLabel label, JComponent comp) {
        JPanel p = new JPanel();
        
        
        p.add(label);
        p.add(comp);
        inputPanel.add(p);
    }
}
