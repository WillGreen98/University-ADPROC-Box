package flexbox.ui;

import flexbox.OrderSession;
import flexbox.Util;
import flexbox.boxtypes.Box;
import flexbox.boxtypes.BoxData;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
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
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 * The user interface of the flex box system
 * @author Group D4
 */
public class FlexBoxGui {
    private static final float FONT_SIZE_TITLE          = 30.0f;
    private static final float FONT_SIZE_ZONE_TITLES    = 25.0f;
    private static final float FONT_SIZE_SECTION_TITLES = 20.0f;
    private static final float FONT_SIZE_LABELS         = 15.0f;
    
    
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

    private final JComboBox<String> comboBoxColourPrint = new JComboBox<>(new String[] {
        "None", "1 Colours", "2 Colours"
    });
    
    private final JCheckBox checkBoxBottomReinforce = new JCheckBox();
    private final JCheckBox checkBoxCornerReinforcement = new JCheckBox();
    private final JCheckBox checkBoxSealableTop = new JCheckBox();

    private final JTextField textBoxQuantity = new JTextField();    
    
    private final JButton submitButton = new JButton("Add to Basket");
    
    private ArrayList<JPanel> basketItems = new ArrayList<>();
    
    /**
     * OUTPUT COMPONENTS
     */
    private JLabel labelTotalCost = new JLabel("£0.00");
    private JLabel labelTotalBoxes = new JLabel("0");
    private JPanel basketPane = new JPanel();
    
    public FlexBoxGui(OrderSession orderSession) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        frame.setSize(1280, 420);
        
        this.orderSession = orderSession;

        initGUI();
        
        //frame.pack();
    }


    /**
     * Creates the input and output sections of the UI
     */
    private void initGUI() {
        JPanel mainOuterPanel = new JPanel();
        mainOuterPanel.setLayout(new BoxLayout(mainOuterPanel, BoxLayout.Y_AXIS));
        mainOuterPanel.add(createCenteredLabel("FlexBox Order System", FONT_SIZE_TITLE)); 
        
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
        outputPanel.add(createCenteredLabel("Basket", FONT_SIZE_ZONE_TITLES));
        
        setUpBasketHeader(outputPanel);
        setUpBasketPanel(outputPanel);
        
        
        return outputPanel;
    }
    
    /**
     * Sets up the top of the basket panel
     * @param outerPanel The panel to add this one to
     */
    private void setUpBasketHeader(JPanel outerPanel) {
        JPanel header = createSectionPanel("Basket Info", outerPanel);
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout());
        innerPanel.add(createLabeledComponentPanelStack("Items in Basket", labelTotalBoxes));
        innerPanel.add(createLabeledComponentPanelStack("Total Cost", labelTotalCost));
        labelTotalBoxes.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelTotalCost.setAlignmentX(Component.CENTER_ALIGNMENT);
        header.add(innerPanel);
    }
    
    /**
     * Sets up the box containing the panel where basket items are displayed
     * @param outerPanel The panel to add the basket panel to
     */
    private void setUpBasketPanel(JPanel outerPanel) {
        JPanel out = createSectionPanel("Boxes In Your Basket", outerPanel);
        JScrollPane scroll = new JScrollPane(basketPane);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //basketPane.setLayout(new BoxLayout(basketPane, BoxLayout.PAGE_AXIS));
        basketPane.setLayout(new GridLayout(0, 1));
        scroll.setPreferredSize(new Dimension(100, 210));
        out.add(scroll);
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
        inputPanel.add(createCenteredLabel("Enter Box Specifications:", FONT_SIZE_ZONE_TITLES));
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
        innerPanel.add(createLabeledComponentPanelStack("Box Height (m) ", textBoxHeight));
        innerPanel.add(createLabeledComponentPanelStack("Box Length (m) ", textBoxLength));
    }

    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box quality (Grade and Colour Prints)
     * @param centerPanel The JPanel to add the panel to
     */
    private void setUpQualityPanel(JPanel centerPanel) {
        JPanel outerPanel = createSectionPanel("Box Quality", centerPanel);
        JPanel innerPanel = createStackPanel();
        outerPanel.add(innerPanel);
        innerPanel.add(createLabeledComponentPanelRow("Cardboard Grade", comboBoxGrade));
        innerPanel.add(createLabeledComponentPanelRow("Box Colors", comboBoxColourPrint));
    }
    
    /**
     * Adds a JPanel to an existing one, containing JComponents for getting 
     * box reinforcement details (bottom & top reinforcement, sealable top)
     * @param centerPanel The JPanel to add the panel to
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
       JPanel p  = createLabeledComponentPanelRow("Quantity of Boxes", textBoxQuantity);

       JPanel p1 = createLabeledComponentPanelStack("", submitButton);
       
       p.setAlignmentX(Component.CENTER_ALIGNMENT);
       p1.setAlignmentX(Component.CENTER_ALIGNMENT);
       innerPanel.add(p);
       innerPanel.add(p1);
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
    private double tryParseInputField(JTextField field, String hint, double min) {
        String input = field.getText();
        double result = 0;

        if (input.length() == 0) {
            promptError("Input field for \"Box " + hint + "\" is empty, please enter a value",
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

        if (result < min) {
            promptError(
                    "Input field for \"Box " + hint + "\" must be greater than or equal to " + min + ".",
                    "Number to small");
            return -1;
        }

        return result;
    }
    
    /**
     * 
     * @param data
     * @return true if all text fields pass the tests, false otherwise
     */
    private boolean tryGetTextFieldInfo(BoxData data) {
        double inputDouble = 0;
        
        //Validate the text field for box width is valid
        inputDouble = tryParseInputField(this.textBoxWidth, "Width", 0.1);
        if ((int)inputDouble == -1) return false;
        data.setWidth(inputDouble);
        
        //Validate the text field for box width is valid
        inputDouble = tryParseInputField(this.textBoxHeight, "Height", 0.1);
        if ((int)inputDouble == -1) return false;
        data.setHeight(inputDouble);
        
        
        inputDouble = tryParseInputField(this.textBoxLength, "Length", 0.1);
        if ((int)inputDouble == -1) return false;
        data.setLength(inputDouble);
        
        
        return true;
    }
    
    /**
     * Creates a basket label panel for some box information
     * @param labelName The label for the information
     * @param variableString The string that contains the information
     * @return JPanel containing 2 JLabels 
     */
    JPanel makeBasketLabel(String labelName, String variableString) {
        JPanel panel    = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        JLabel left     = new JLabel(labelName);
        JLabel right    = new JLabel(variableString);

        Font font = right.getFont();
        right.setFont(
                font.deriveFont(font.getStyle() | Font.ITALIC | ~Font.ITALIC)); //not bold
        
        panel.add(left);
        panel.add(right);
        return panel;
    }
    
    /**
     * Creates a basket label panel for some box information
     * @param labelName The label for the information
     * @param varInt The int that contains the information
     * @return JPanel containing 2 JLabels 
     */
    JPanel makeBasketLabel(String labelName, int varInt) {
        return makeBasketLabel(labelName, Integer.toString(varInt));
    }
    
    /**
     * Creates a basket label panel for some box information
     * @param labelName The label for the information
     * @param varDouble The double that contains the information
     * @return JPanel containing 2 JLabels 
     */
    JPanel makeBasketLabel(String labelName, double varDouble) {
        return makeBasketLabel(labelName, Double.toString(varDouble));
    }

    /**
     * Adds box information to display onto the basket panel
     * @param basketItemInfo 
     */
    private void addBasketItem(BasketItemInfo basketItemInfo) {
        Box box = basketItemInfo.getBox();
        JPanel basketPanel = new JPanel();
        basketPanel.setLayout(new BoxLayout(basketPanel, BoxLayout.X_AXIS));
        
        //Add basket item information
        JPanel itemInfoStack = createStackPanel();
        itemInfoStack.add(makeBasketLabel("Item #", orderSession.getNumberItemsInBasket()));
        itemInfoStack.add(makeBasketLabel("Box Type: ", basketItemInfo.getBoxType()));
        
        //Add box dimension info
        JPanel sizeStack = createStackPanel();
        sizeStack.add(makeBasketLabel("Width: ", box.getData().getWidth ()));
        sizeStack.add(makeBasketLabel("Height: ", box.getData().getHeight()));
        sizeStack.add(makeBasketLabel("Length: ", box.getData().getLength()));
        
        //Add reinforcement info
        JPanel reinforcementStack = createStackPanel();
        reinforcementStack.add(makeBasketLabel("Corner Reinforced? ",
                (box.getData().isCornerReinforced()? "Yes" : "No")));
        reinforcementStack.add(makeBasketLabel("Bottom Reinforced? ",
                (box.getData().isBottomReinforced()? "Yes" : "No")));
        reinforcementStack.add(makeBasketLabel("Top Sealable? ",
                (box.getData().isTopSealable()? "Yes" : "No")));
        
        //Add box/ cardboard quality info
        JPanel qualityStack = createStackPanel();
        qualityStack.add(makeBasketLabel("Grade: ", box.getData().getGrade()));
        qualityStack.add(makeBasketLabel("Colours: ", box.getData().getColour()));
        
        //Add box cost and quantity information
        double singleCost = Util.roundDoubleTo2dp(box.calculateSingleBoxCost());
        double totalCost  = Util.roundDoubleTo2dp(box.calculateCost());
        JPanel costStack = createStackPanel();
        costStack.add(makeBasketLabel("Quantity: ",      box.getQuantity()));
        costStack.add(makeBasketLabel("Cost Per Box: ", "£" + singleCost));
        costStack.add(makeBasketLabel("Total Cost: ",   "£" + totalCost));
        
        //Aff the information to the basket
        int gap = 14;
        basketPanel.add(itemInfoStack); 
        basketPanel.add(javax.swing.Box.createRigidArea(new Dimension(gap,0)));
        basketPanel.add(sizeStack);
        basketPanel.add(javax.swing.Box.createRigidArea(new Dimension(gap,0)));
        basketPanel.add(qualityStack);
        basketPanel.add(javax.swing.Box.createRigidArea(new Dimension(gap,0)));
        basketPanel.add(reinforcementStack);
        basketPanel.add(javax.swing.Box.createRigidArea(new Dimension(gap,0)));
        basketPanel.add(costStack);
        basketPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.basketPane.add(basketPanel);
    }
    
    /**
     * Tries to add a quantity of boxes to the basket
     */
    private void tryAddToBasket() {
        BoxData data = new BoxData();
        
        //Validate the text fields are valid, if not then return early
        if (!tryGetTextFieldInfo(data)) {
            return;
        }
        
        //Get the box quality options
        data.setGrade(comboBoxGrade.getSelectedIndex() + 1);
        data.setColour(comboBoxColourPrint.getSelectedIndex());
       
        //Get box reinforcement details
        data.setBottomReinforcement(checkBoxBottomReinforce.isSelected());
        data.setCornerReinforcement(checkBoxCornerReinforcement.isSelected());
        data.setTopSealable(checkBoxSealableTop.isSelected());
        
        int quantity = (int)tryParseInputField(this.textBoxQuantity, "Quantity", 1);
        if (quantity == -1) return;
        
        BasketItemInfo box = this.orderSession.tryAddBox(data, quantity);
        if (box != null) {
            labelTotalCost.setText("£" + orderSession.getTotalCost());
            labelTotalBoxes.setText(
                    Integer.toString(orderSession.getTotalBoxQuantity()));
            addBasketItem(box);
        } else {
           promptError("FlexBox does not supply this type of box.",
                       "Box Type Not Supplied");
        }
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
        panel.add(createCenteredLabel(labelText, FONT_SIZE_LABELS));
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
        panel.add(createCenteredLabel(labelText, FONT_SIZE_LABELS));
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
        sect.add(createCenteredLabel(title, FONT_SIZE_SECTION_TITLES));
        return sect;
    }
    
    /**
     * Creates a JPanel where the JComponenets added will be vertically aligned
     * using BoxLayout
     * @return Vertically aligned JPanel
     */
    private JPanel createStackPanel() {
        JPanel sect = new JPanel();
        sect.setLayout(new BoxLayout(sect, BoxLayout.PAGE_AXIS));
        return sect;
    }
}
