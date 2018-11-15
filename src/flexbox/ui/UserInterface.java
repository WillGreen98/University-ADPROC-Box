package flexbox.ui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class UserInterface {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private JFrame frame = new JFrame("ADPROC - FlexBox CW");
    
    private JTextField textBoxLength = new JTextField();
    private JTextField textBoxWidth = new JTextField();
    private JTextField textBoxHeight = new JTextField();    
    
    private JComboBox<String> comboBoxGrade = new JComboBox<>(new String[] {
        "1", "2", "3", "4", "5"
    });

    private JComboBox<String> comboBoxColourPrint = new JComboBox<>(new String[]{
        "None", "1 Colours", "2 Colours"
    });
    
    private JCheckBox checkBoxBottomReinforce = new JCheckBox();
    private JCheckBox checkBoxCornerReinforcement = new JCheckBox();
    private JCheckBox checkBoxSealableTop = new JCheckBox();

    private JTextField textBoxQuantity = new JTextField();    
    
    private JButton submitButton = new JButton("Add to Basket");

    public UserInterface() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);

        initGUI();
        
        frame.pack();
    }


    
    private void initGUI() {
        JPanel mainOuterPanel = new JPanel();
        mainOuterPanel.setLayout(new BoxLayout(mainOuterPanel, BoxLayout.Y_AXIS));
        mainOuterPanel.add(createTitleLabel("FlexBox Order System", 24.0f)); 
        
        //Create the UI
        JPanel uiPanel = new JPanel();
        uiPanel.setLayout(new GridLayout()); 
        uiPanel.add(createInputUI());
        uiPanel.add(createOutputUI());
        mainOuterPanel.add(uiPanel);
        
        //Add the button and add it all to the window
        submitButton.addActionListener(event -> test());
        frame.add(mainOuterPanel);
    }
    
    private JPanel createOutputUI() {
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
        outputPanel.setBorder(BorderFactory.createBevelBorder(0));
        outputPanel.add(createTitleLabel("Output", 20.0f));
        return outputPanel;
    }
    
    private JPanel createInputUI() {
        //Panel for the center of the input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.setBorder(BorderFactory.createBevelBorder(0));
        inputPanel.add(createTitleLabel("Input", 20.0f));
        textBoxHeight.setColumns(10);
        textBoxLength.setColumns(10);
        textBoxWidth.setColumns(10);
        textBoxQuantity.setColumns(10);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout());
        
        setUpDimensionInputs(inputPanel);
        setUpQualityPanel(centerPanel);
        setUpReinforcementPanel(centerPanel);
        inputPanel.add(centerPanel);
        setUpAddItemPanel(inputPanel);
        
        
        submitButton.addActionListener(event -> test());
        return inputPanel;
    }
    
    private void setUpDimensionInputs(JPanel panel) {
        JPanel outerPanel = createSectionPanel("Box Dimensions", panel);
        JPanel innerPanel = new JPanel();
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelStack("Box Width (M)", textBoxWidth));
        innerPanel.add(createLabeledComponentPanelStack("Box Length (M)", textBoxLength));
        innerPanel.add(createLabeledComponentPanelStack("Box Height (M)", textBoxHeight));
    }
    
    private void setUpQualityPanel(JPanel centerPanel) {
        JPanel outerPanel = createSectionPanel("Box Quality", centerPanel);
        JPanel innerPanel = createStackPanel();
        outerPanel.add(innerPanel);
        //outerPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        innerPanel.add(createLabeledComponentPanelRow("Box Grade", comboBoxGrade));
        innerPanel.add(createLabeledComponentPanelRow("Box Colors", comboBoxColourPrint));
    }
    
     private void setUpReinforcementPanel(JPanel centerPanel) {
        JPanel outerPanel = createSectionPanel("Box Reinforcement", centerPanel);
        JPanel innerPanel = createStackPanel();
        //outerPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelRow("Reinforce Bottom?", checkBoxBottomReinforce));
        innerPanel.add(createLabeledComponentPanelRow("Reinforce Corners?", checkBoxCornerReinforcement));
        innerPanel.add(createLabeledComponentPanelRow("Sealable Top?", checkBoxSealableTop));
    }
     
    private void setUpAddItemPanel(JPanel panel) {
       JPanel outerPanel = createSectionPanel("Add box to basket", panel);
       JPanel innerPanel = new JPanel();
       outerPanel.add(innerPanel);
       innerPanel.add(createLabeledComponentPanelStack("Quantity", textBoxQuantity));
       innerPanel.add(createLabeledComponentPanelStack("", submitButton));
    }
    
    /*
        HELPER FUNCTIONS
        The functions below help with the creation of the UI by avoiding a lot of
        repeated code
    */
    private JPanel createLabeledComponentPanelStack(String labelText, JComponent component) {
        JPanel panel =  createStackPanel();
        panel.add(new JLabel(labelText));
        panel.add(component);
        return panel;
    }
    
    private JPanel createLabeledComponentPanelRow(String labelText, JComponent component) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(labelText));
        panel.add(component);
        return panel;
    }
    
    private JLabel createTitleLabel(String name, float size) {
        JLabel title = new JLabel(name, SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(size));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        return title;
    }
    
    private JPanel createSectionPanel(String title, JPanel outerPanel) {
        JPanel sect =  createStackPanel();
        outerPanel.add(sect);
        sect.setBorder(BorderFactory.createBevelBorder(1));
        sect.add(createTitleLabel(title, 18.0f));
        return sect;
    }
    
    private JPanel createStackPanel() {
        JPanel sect = new JPanel();
        sect.setLayout(new BoxLayout(sect, BoxLayout.Y_AXIS));
        return sect;
    }
    
    private void test() {
        System.out.println("Submit Button Pressed");
    }
}
