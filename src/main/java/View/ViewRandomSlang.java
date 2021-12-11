package View;


import javax.swing.*;
import java.awt.*;

public class ViewRandomSlang extends JFrame {

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

    public ViewRandomSlang() throws HeadlessException {

        setTitle("Add");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnAdd = new JButton("Random");
        txtDefine = new JTextField(20);
        txtSlangword = new JTextField(20);
        lblDefine = new JLabel("Definition");
        lblSlang = new JLabel("Slang Word");

        panel.add(lblSlang);
        panel.add(txtSlangword);
        panel.add(lblDefine);
        panel.add(txtDefine);
        panel.setPreferredSize(new Dimension(400,50));

        setLayout(new BorderLayout());

        add(panel);
        add(btnAdd,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}
