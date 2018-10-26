package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Test extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JLabel introLbl, lbl1, lbl2, lbl3, lbl4, lbl5;
    private JTextField txtfld1, txtfld2, txtfld3, txtfld4, txtfld5;
    private JButton btn1;
    private JTextArea txtArea1;

    public static void main(String[] args) {
        GUI_Test GUI = new GUI_Test();
        GUI.init();

        GUI.setSize(800, 450);
        GUI.setTitle("Boxes");
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        Container pane = this.getContentPane();
        pane.setLayout(null);

        introLbl = new JLabel();
        introLbl.setBounds(10, 10, 300, 20);
        introLbl.setText("ADPROC - CW Boxes");

        lbl1 = new JLabel("Type");
        lbl1.setBounds(10, 30, 80, 20);
        txtfld1 = new JTextField();
        txtfld1.setBounds(70, 30, 100, 20);

        lbl2 = new JLabel("Grade");
        lbl2.setBounds(10, 60, 80, 20);
        txtfld2 = new JTextField();
        txtfld2.setBounds(70, 60, 100, 20);

        lbl3 = new JLabel("Colour");
        lbl3.setBounds(10, 90, 80, 20);
        txtfld3 = new JTextField();
        txtfld3.setBounds(70, 90, 100, 20);

        lbl4 = new JLabel("Reinforced Bottom");
        lbl4.setBounds(10, 120, 80, 20);
        txtfld4 = new JTextField();
        txtfld4.setBounds(70, 120, 100, 20);

        lbl5 = new JLabel("Reinforced Corners");
        lbl5.setBounds(10, 150, 80, 20);
        txtfld5 = new JTextField();
        txtfld5.setBounds(70, 150, 100, 20);

        btn1 = new JButton("Submit Values");
        btn1.setBounds(10, 200, 100, 20);

        btn1.addActionListener(this);

        txtArea1 = new JTextArea("Results: ");
        txtArea1.setFont(new Font("monospaced", Font.PLAIN, 12));
        txtArea1.setBounds(250, 20, 500, 400);

        pane.add(introLbl);
        pane.add(lbl1);
        pane.add(lbl2);
        pane.add(lbl3);
        pane.add(lbl4);
        pane.add(lbl5);
        pane.add(txtfld1);
        pane.add(txtfld2);
        pane.add(txtfld3);
        pane.add(txtfld4);
        pane.add(txtfld5);
        pane.add(btn1);
        pane.add(txtArea1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int temp1 = Integer.parseInt(txtfld1.getText());
            int temp2 = Integer.parseInt(txtfld2.getText());
        } catch (NumberFormatException ex) {
            System.out.println("Exception: " + ex);
            JOptionPane.showMessageDialog(this, "Please enter a warning message");
        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException ex) {
            //warnings..
        }
    }
}
