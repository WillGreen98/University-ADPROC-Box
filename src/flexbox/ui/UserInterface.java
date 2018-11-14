package flexbox.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComponent;

public class UserInterface {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    
    private JPanel mainPanel = new JPanel();
    private JPanel inputPanel = new JPanel();

    private JTextField textBoxLength = new JTextField();
    private JTextField textBoxWidth = new JTextField();
    private JTextField textBoxHeight = new JTextField();    
    
    private JComboBox<String> comboBoxGrade = new JComboBox<>(new String[] {
        "1", "2", "3", "4", "5"
    });

    private JComboBox<String> comboBoxColourPrint = new JComboBox<>(new String[]{
        "None", "1 Colours", "2 Colours"
    });
    
    private JCheckBox checkBoxReinforce = new JCheckBox();
    private JCheckBox checkBoxCornerReinforcement = new JCheckBox();
    private JCheckBox checkBoxSealableTop = new JCheckBox();

    private JTextField textBoxQuantity = new JTextField();    
    
    private JButton submitButton = new JButton("Add boxes");

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
        textBoxQuantity.setColumns(10);
        
        submitButton.addActionListener(event -> test());

        initComponents("Box Height:", textBoxHeight);
        initComponents("Box Width:", textBoxWidth);
        initComponents("Box Length:", textBoxLength);
        initComponents("Box Grade:", comboBoxGrade);
        initComponents("Box Colors:", comboBoxColourPrint);
        initComponents("Reinforce Bottom?", checkBoxReinforce);
        initComponents("Reinforce Corners?", checkBoxCornerReinforcement);
        initComponents("Reinforce Bottom?", checkBoxSealableTop);
        initComponents("Box Quantity", textBoxQuantity);
        
        mainPanel.add(submitButton);
        
        frame.pack();
    }

    private void initComponents(String title, JComponent component) {
        JLabel label = new JLabel(title);
        JPanel p = new JPanel();

        p.add(label);
        p.add(component);
        inputPanel.add(p);
    }
    
    private void test() {
        System.out.println("Submit Button Pressed");
    }
}
