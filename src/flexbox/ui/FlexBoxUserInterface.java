package flexbox.ui;

import flexbox.OrderSession;
import flexbox.Util;
import flexbox.boxtypes.BoxData;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 * @author Group D4
 */

public class FlexBoxUserInterface extends javax.swing.JFrame {
    OrderSession session;
    JPanel basketMainPanel = new JPanel();
    
    final static int MIN_BOX_SIZE = 200;
    final static int MAX_BOX_SIZE = 3500;
    /**
     * Creates new form GUI
     * @param session The order session for this FlexBox order
     */

    FlexBoxUserInterface() {}
    public FlexBoxUserInterface(OrderSession session) {
        initComponents();
        this.session = session;

        basketMainPanel.setLayout(new GridLayout(0, 1));
        basketScrollPane.setViewportView(basketMainPanel);
        setResizable(false);

        basketScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fieldBoxQuantity = new javax.swing.JTextField();
        buttonAddToBasket = new javax.swing.JButton();
        errorLabelBoxQuantity = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        dropdownGrade = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        dropDownColours = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        checkBoxCorners = new javax.swing.JCheckBox();
        checkBoxBottom = new javax.swing.JCheckBox();
        checkBoxTop = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        textBoxWidth = new javax.swing.JTextField();
        textBoxHeight = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        textBoxLength = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        widthErrorLabel = new javax.swing.JLabel();
        heightErrorLabel = new javax.swing.JLabel();
        lengthErrorLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelOrderCost = new javax.swing.JLabel();
        labelBasketItems = new javax.swing.JLabel();
        labelTotalBoxes = new javax.swing.JLabel();
        basketScrollPane = new javax.swing.JScrollPane();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlexBox");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("FlexBox Ordering System");

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Quantity and Add");

        jLabel17.setText("Quantity To Add");
        jLabel17.setToolTipText("");

        fieldBoxQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldBoxQuantityKeyReleased(evt);
            }
        });

        buttonAddToBasket.setText("Add To Basket");
        buttonAddToBasket.setToolTipText("");
        buttonAddToBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddToBasketActionPerformed(evt);
            }
        });

        errorLabelBoxQuantity.setForeground(new java.awt.Color(255, 51, 0));
        errorLabelBoxQuantity.setText("Box quantity is empty.");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddToBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorLabelBoxQuantity))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonAddToBasket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelBoxQuantity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setText("Quality and Colour");

        dropdownGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" }));

        jLabel32.setText("Cardboard Grade");

        dropDownColours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colours", "1 Colour", "2 Colours" }));

        jLabel33.setText("Colours to Print");
        jLabel33.setToolTipText("");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropdownGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(dropDownColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropdownGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropDownColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setText("Reinforcement");

        checkBoxCorners.setText("Reinforce Corners?");

        checkBoxBottom.setText("Reinforce Bottom?");

        checkBoxTop.setText("Sealable Top?");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxCorners)
                            .addComponent(checkBoxBottom)
                            .addComponent(checkBoxTop))
                        .addGap(0, 44, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(checkBoxCorners)
                .addGap(18, 18, 18)
                .addComponent(checkBoxBottom)
                .addGap(18, 18, 18)
                .addComponent(checkBoxTop)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setText("Dimensions");

        jLabel36.setText("Box Width (mm)");

        textBoxWidth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxWidthKeyReleased(evt);
            }
        });

        textBoxHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxHeightKeyReleased(evt);
            }
        });

        jLabel37.setText("Box Height (mm)");

        textBoxLength.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxLengthKeyReleased(evt);
            }
        });

        jLabel38.setText("Box Length (mm)");

        widthErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        widthErrorLabel.setText("Box width is empty.");
        widthErrorLabel.setToolTipText("");

        heightErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        heightErrorLabel.setText("Box height is empty.");
        heightErrorLabel.setToolTipText("");

        lengthErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        lengthErrorLabel.setText("Box length is empty.");
        lengthErrorLabel.setToolTipText("");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(widthErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textBoxWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel37))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textBoxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(textBoxLength, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(heightErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(lengthErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBoxWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBoxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBoxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(widthErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lengthErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Enter Box Specifications");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Basket");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setText("Total Order Cost");

        jLabel3.setText("Total Basket Items");

        jLabel4.setText("Total Boxes");

        labelOrderCost.setText("£0.00");

        labelBasketItems.setText("0");

        labelTotalBoxes.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelOrderCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelBasketItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTotalBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOrderCost)
                        .addComponent(labelBasketItems))
                    .addComponent(labelTotalBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(basketScrollPane)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basketScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Prompts an error to the user
     * @param title The title of the error box
     * @param text  The text of the error
     */
    private void promptError(String title, String text) {
        JOptionPane.showMessageDialog(this, title, text,
                    JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Tries to parse an input field into a double, and returns input if it is valid,
     * -1 otherwise
     * @param field The JTextField to parse
     * @param hint Incase of an error, the hint is used to produce the error text
     * @return The parsed input is successful, otherwise return -1 on error
     */
    private int tryParseInputField(JTextField field, String hint, int min, int max) {
        String input = field.getText();
        int result = 0;
        if (input.length() == 0) {
            promptError("Input field for \"Box " + hint + "\" is empty, please enter a value",
                        "Empty Input");
            return -1;
        }
        try {
            result = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            promptError("Input field for \"Box " + hint + "\" should be an integer number.",
                        "Invalid Input Type");
            return -1;
        }
        if (result < min) {
            promptError(
                    "Input field for \"Box " + hint + "\" is too small.\n" + 
                    "The input must be larger than or equal to " + min + ".",
                    "Number Input Too Small.");
            return -1;
        }
        if (result > max) {
            promptError(
                    "Input field for \"Box " + hint + "\" is too large.\n" + 
                    "The input must be smaller than or equal to " + max + ".",
                    "Number Input Too Large.");
            return -1;  
        }
        return result;
    }

    /**
     * Gets the text field information from the dimension input fields
     * @param data The box data to set values for
     * @return true if all text fields pass the tests, false otherwise
     */
    private boolean tryGetTextFieldInfo(BoxData data) {
        //Validate the text field for box width is valid
        int inputInt = tryParseInputField(textBoxWidth, "Width in mm", MIN_BOX_SIZE, MAX_BOX_SIZE);
        if (inputInt == -1) return false;
        data.setWidth(inputInt);

        //Validate the text field for box width is valid
        inputInt = tryParseInputField(textBoxHeight, "Height in mm", MIN_BOX_SIZE, MAX_BOX_SIZE);
        if (inputInt == -1) return false;
        data.setHeight(inputInt);


        inputInt = tryParseInputField(textBoxLength, "Length in mm", MIN_BOX_SIZE, MAX_BOX_SIZE);
        if (inputInt == -1) return false;
        data.setLength(inputInt);
      

        return true;
    }

    /**
     * Event for pressing the add to basket button.
     * @param evt
     */
    private void buttonAddToBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddToBasketActionPerformed
        BoxData data = new BoxData();

        //Validate the text fields are valid, if not then return early
        if (!tryGetTextFieldInfo(data)) {
            return;
        }

        //Get the box quality options
        data.setGrade(dropdownGrade.getSelectedIndex() + 1);
        data.setColour(dropDownColours.getSelectedIndex());

        //Get box reinforcement details
        data.setBottomReinforcement(checkBoxBottom.isSelected());
        data.setCornerReinforcement(checkBoxCorners.isSelected());
        data.setTopSealable(checkBoxTop.isSelected());

        int quantity = (int)tryParseInputField(this.fieldBoxQuantity, "Quantity", 1, 500);
        if (quantity == -1) return;

        BasketItemInfo box = this.session.tryAddBox(data, quantity);
        if (box != null) {
            labelOrderCost.setText("£" +
                    Util.formatNumberWithSeperators(session.getTotalCost()));
            labelBasketItems.setText(
                    Integer.toString(session.getNumberItemsInBasket()));
            labelTotalBoxes.setText(
                    Util.formatNumberWithSeperators(session.getTotalBoxQuantity()));

            basketMainPanel.add(new BasketItemPanel(box, session));
        } else {
           promptError("FlexBox does not supply this type of box.",
                       "Box Type Not Supplied");
        }
    }//GEN-LAST:event_buttonAddToBasketActionPerformed

    private void realTimeValidateTextField(String hint, JTextField textField, JLabel errorLabel, int min, int max) {
        int value = 0;
        String input = textField.getText();
        if (input.equals("")) {
            errorLabel.setText("Box " + hint + " is empty. ");
            errorLabel.setForeground(Color.red);
            return;
        }
        try {
            value = Integer.valueOf(input);
        }
        catch(NumberFormatException e) {
            errorLabel.setText("Box " + hint + " should be an integer");
            errorLabel.setForeground(Color.red);
            return;
        }
        if (value > max) {
            errorLabel.setText("Box " + hint + " should be less than " + max);
            errorLabel.setForeground(Color.red);
            return;
        }
        if (value < min) {
            errorLabel.setText("Box " + hint + " should be greater than " + min);
            errorLabel.setForeground(Color.red);
            return;
        }
        errorLabel.setText("Box " + hint + " is valid.");
        errorLabel.setForeground(Color.black);
    }
    
    
    private void textBoxWidthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxWidthKeyReleased
        realTimeValidateTextField("width", textBoxWidth, widthErrorLabel, MIN_BOX_SIZE, MAX_BOX_SIZE);
    }//GEN-LAST:event_textBoxWidthKeyReleased

    private void textBoxHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxHeightKeyReleased
        realTimeValidateTextField("height", textBoxHeight, heightErrorLabel, MIN_BOX_SIZE, MAX_BOX_SIZE);
    }//GEN-LAST:event_textBoxHeightKeyReleased

    private void textBoxLengthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxLengthKeyReleased
        realTimeValidateTextField("length", textBoxLength, lengthErrorLabel, MIN_BOX_SIZE, MAX_BOX_SIZE);
    }//GEN-LAST:event_textBoxLengthKeyReleased

    private void fieldBoxQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBoxQuantityKeyReleased
        realTimeValidateTextField("quantity", fieldBoxQuantity, errorLabelBoxQuantity, 1, 500);
    }//GEN-LAST:event_fieldBoxQuantityKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane basketScrollPane;
    private javax.swing.JButton buttonAddToBasket;
    private javax.swing.JCheckBox checkBoxBottom;
    private javax.swing.JCheckBox checkBoxCorners;
    private javax.swing.JCheckBox checkBoxTop;
    private javax.swing.JComboBox<String> dropDownColours;
    private javax.swing.JComboBox<String> dropdownGrade;
    private javax.swing.JLabel errorLabelBoxQuantity;
    private javax.swing.JTextField fieldBoxQuantity;
    private javax.swing.JLabel heightErrorLabel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBasketItems;
    private javax.swing.JLabel labelOrderCost;
    private javax.swing.JLabel labelTotalBoxes;
    private javax.swing.JLabel lengthErrorLabel;
    private javax.swing.JTextField textBoxHeight;
    private javax.swing.JTextField textBoxLength;
    private javax.swing.JTextField textBoxWidth;
    private javax.swing.JLabel widthErrorLabel;
    // End of variables declaration//GEN-END:variables
}
