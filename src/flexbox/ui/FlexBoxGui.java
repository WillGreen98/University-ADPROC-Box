package flexbox.ui;

import flexbox.OrderSession;
import flexbox.boxtypes.BoxData;
import java.awt.Component;
import java.awt.GridLayout;
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 * The user interface
 * @author Group D4
 */
public class FlexBoxGui {
    private final JFrame frame = new JFrame("FlexBox Ordering System");
    private final OrderSession orderSession;
    /**
     * INPUT COMPONENTS
     */
    private final JTextField textBoxLength = new JTextField();
    private final JTextField textBoxWidth = new JTextField();
    private final JTextField textBoxHeight = new JTextField();    
    
    private final JComboBox<String> comboBoxGrade = new JComboBox<>(new String[] {
        "1", "2", "3", "4", "5"
    });

    private final JComboBox<String> comboBoxColourPrint = new JComboBox<>(new String[]{
        "None", "1 Colours", "2 Colours"
    });
    
    private final JCheckBox checkBoxBottomReinforce = new JCheckBox();
    private final JCheckBox checkBoxCornerReinforcement = new JCheckBox();
    private final JCheckBox checkBoxSealableTop = new JCheckBox();

    private final JTextField textBoxQuantity = new JTextField();    
    
    private final JButton submitButton = new JButton("Add to Basket");
    
    /**
     * OUTPUT COMPONENTS
     */
    JLabel labelTotalCost = new JLabel();
    
    public FlexBoxGui(OrderSession orderSession) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        this.orderSession = orderSession;

        initGUI();
        
        frame.pack();
    }


    /**
     * Creates the input and output sections of the UI
     */
    private void initGUI() {
        JPanel mainOuterPanel = new JPanel();
        mainOuterPanel.setLayout(new BoxLayout(mainOuterPanel, BoxLayout.Y_AXIS));
        mainOuterPanel.add(createCenteredLabel("FlexBox Order System", 26.0f)); 
        
        //Create the UI
        JPanel uiPanel = new JPanel();
        uiPanel.setLayout(new GridLayout()); 
        uiPanel.add(createInputUI());
        uiPanel.add(createOutputUI());
        mainOuterPanel.add(uiPanel);
        
        //Add everything to the main window
        frame.add(mainOuterPanel);
    }
    
    /**
     * Creates a JPanel that contains the output section of the UI
     * @return A JPanel containing the output UI
     */
    private JPanel createOutputUI() {
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
        outputPanel.setBorder(BorderFactory.createBevelBorder(0));
        outputPanel.add(createCenteredLabel("Basket", 20.0f));
        
        
        return outputPanel;
    }
    
    /**
     * Creates a JPanel that contains the input section of the UI
     * @return A JPanel containing the input UI
     */
    private JPanel createInputUI() {
        //Panel for the center of the input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.setBorder(BorderFactory.createBevelBorder(0));
        inputPanel.add(createCenteredLabel("Input", 24.0f));
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
        
        
        submitButton.addActionListener(event -> tryAddToBasket());
        return inputPanel;
    }
    
    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box dimensions (Width, Height, and Length)
     * @param panel The JPanel to add the panel to 
     */
    private void setUpDimensionInputs(JPanel panel) {
        JPanel outerPanel = createSectionPanel("Box Dimensions", panel);
        JPanel innerPanel = new JPanel();
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelStack("Box Width (m)  ", textBoxWidth));
        innerPanel.add(createLabeledComponentPanelStack("Box Length (m) ", textBoxLength));
        innerPanel.add(createLabeledComponentPanelStack("Box Height (m) ", textBoxHeight));
    }

    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box quality (Grade and Colour Prints)
     * @param panel The JPanel to add the panel to 
     */
    private void setUpQualityPanel(JPanel centerPanel) {
        JPanel outerPanel = createSectionPanel("Box Quality", centerPanel);
        JPanel innerPanel = createStackPanel();
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelRow("Box Grade", comboBoxGrade));
        innerPanel.add(createLabeledComponentPanelRow("Box Colors", comboBoxColourPrint));
    }
    
    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box reinforcement details (bottom & top reinforcement, sealable top)
     * @param panel The JPanel to add the panel to 
     */
     private void setUpReinforcementPanel(JPanel centerPanel) {
        JPanel outerPanel = createSectionPanel("Box Reinforcement", centerPanel);
        JPanel innerPanel = createStackPanel();
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelRow("Reinforce Bottom?", checkBoxBottomReinforce));
        innerPanel.add(createLabeledComponentPanelRow("Reinforce Corners?", checkBoxCornerReinforcement));
        innerPanel.add(createLabeledComponentPanelRow("Sealable Top?", checkBoxSealableTop));
    }
     
    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box quantity of the box to add to  basket, as well as the button for
     * actually adding the box to the basket
     * @param panel The JPanel to add the panel to 
     */
    private void setUpAddItemPanel(JPanel panel) {
       JPanel outerPanel = createSectionPanel("Add box to basket", panel);
       JPanel innerPanel = createStackPanel();
       outerPanel.add(innerPanel);
       JPanel p  = createLabeledComponentPanelStack("Quantity", textBoxQuantity);
       JPanel p1 = createLabeledComponentPanelStack(" ", submitButton);
       
       p.setAlignmentX(Component.CENTER_ALIGNMENT);
       p1.setAlignmentX(Component.CENTER_ALIGNMENT);
       innerPanel.add(p);
       innerPanel.add(p1);
    }
    
    /// HELPER FUNCTIONS
    /// The functions below help with the creation of the UI by avoiding a lot of
    /// repeated code
    /**
     * Creates a JPanel with 2 elements:
     *  - A JLabel
     *  - A JComponent
     *  These will be added in a fashion where the label is above the component.
     * @param labelText The text of the label 
     * @param component The component to labelled
     * @return A JPanel with the label and component
     */
    private JPanel createLabeledComponentPanelStack(String labelText, JComponent component) {
        JPanel panel =  createStackPanel();
        panel.add(createCenteredLabel(labelText, 14.0f));
        panel.add(component);
        return panel;
    }
    
    /**
     * Creates a JPanel with 2 elements:
     *  - A JLabel
     *  - A JComponent
     *  These will be added in a fashion where the label is left of the component.
     * @param labelText The text of the label 
     * @param component The component to labelled
     * @return A JPanel with the label and component
     */
    private JPanel createLabeledComponentPanelRow(String labelText, JComponent component) {
        JPanel panel = new JPanel();
        panel.add(createCenteredLabel(labelText, 14.0f));
        panel.add(component);
        return panel;
    }
    
    /**
     * Creates a centre aligned label
     * @param titleText The text for the label
     * @param fontSize The font size for the label
     * @return A centre aligned JLabel
     */
    private JLabel createCenteredLabel(String titleText, float fontSize) {
        JLabel title = new JLabel(titleText, SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(fontSize));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        return title;
    }
    
    /**
     * Creates a section JPanel, meaning one of which has a title and border
     * @param title The title for the label of the section
     * @param outerPanel The JPanel to add this to
     * @return The section panel
     */
    private JPanel createSectionPanel(String title, JPanel outerPanel) {
        JPanel sect =  createStackPanel();
        outerPanel.add(sect);
        sect.setBorder(BorderFactory.createBevelBorder(1));
        sect.add(createCenteredLabel(title, 18.0f));
        return sect;
    }
    
    /**
     * Creates a JPanel where the JComponenets added will be vertically aligned
     * using BoxLayout
     * @return Vertically aligned JPanel
     */
    private JPanel createStackPanel() {
        JPanel sect = new JPanel();
        sect.setLayout(new BoxLayout(sect, BoxLayout.Y_AXIS));
        return sect;
    }
    
    /// INPUT FIELD VALIDATION FUNCTIONS
    /// Functions to help validate the user input
    
    /**
     * Prompts an error to the user
     * @param title The title of the error box
     * @param text  The text of the error
     */
    private void promptError(String title, String text) {
        JOptionPane.showMessageDialog(frame, title, text,
                    JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Tries to parse an input field into a double, and returns input if it is valid,
     * -1 otherwise
     * @param field The JTextField to parse
     * @param hint Incase of an error, the hint is used to produce the error text
     * @return The parsed input is successful, otherwise return -1 on error
     */
    private double tryParseInputField(JTextField field, String hint) {
        String input = field.getText();
        double result = 0;
        if (input.length() == 0) {
            promptError("Input field for \"Box " + hint + "\" is empty.",
                        "Empty Input");
            return -1;
        }
        try { 
            result = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            promptError("Input field for \"Box " + hint + "\" should be a number.",
                        "Invalid Input Type");
            return -1;
        }
        if (result <= 0.1) {
            promptError(
                    "Input field for \"Box " + hint + "\" must be greater than or equal to 0.1.",
                    "Number to small");
            return -1;
        }
        return result;
    }

    
    private void tryAddToBasket() {
        BoxData data = new BoxData();
        double inputDouble;
        inputDouble = tryParseInputField(this.textBoxHeight, "Height");
        data.setHeight(inputDouble);
        if ((int)inputDouble == -1) return;
        
        inputDouble = tryParseInputField(this.textBoxWidth, "Width");
        data.setWidth(inputDouble);
        if ((int)inputDouble == -1) return;
        
        inputDouble = tryParseInputField(this.textBoxLength, "Length");
        data.setLength(inputDouble);
        if ((int)inputDouble == -1) return;
    }
}
