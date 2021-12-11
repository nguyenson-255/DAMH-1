package View;


import javax.swing.*;
import java.awt.*;

public class ViewAdd extends JFrame {

    private JButton btnAdd;
    private JTextField txtDefine , txtSlangword;
    private JLabel lblDefine,lblSlang;

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JTextField getTxtDefine() {
        return txtDefine;
    }

    public JTextField getTxtSlangword() {
        return txtSlangword;
    }

    public JLabel getLblDefine() {
        return lblDefine;
    }

    public JLabel getLblSlang() {
        return lblSlang;
    }

    public ViewAdd() throws HeadlessException {

        setTitle("Add");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnAdd = new JButton("Add");
        txtDefine = new JTextField(20);
        txtSlangword = new JTextField(20);
        lblDefine = new JLabel("Definition");
        lblSlang = new JLabel("Slang Word");

        panel.add(lblSlang);
        panel.add(txtSlangword);
        panel.add(lblDefine);
        panel.add(txtDefine);
        panel.setPreferredSize(new Dimension(300,50));

        setLayout(new BorderLayout());

        add(panel);
        add(btnAdd,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}
