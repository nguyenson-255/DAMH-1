package View;


import javax.swing.*;
import java.awt.*;

public class ViewEdit extends JFrame {

    private JButton btnEdit;
    private JTextField txtSlangword;
    private JLabel lblSlang;

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JTextField getTxtSlangword() {
        return txtSlangword;
    }

    public JLabel getLblSlang() {
        return lblSlang;
    }

    public ViewEdit() throws HeadlessException {

        setTitle("Edit");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnEdit = new JButton("Edit");
        txtSlangword = new JTextField(20);

        lblSlang = new JLabel("Slang Word");
        panel.add(lblSlang);
        panel.add(txtSlangword);
        setLayout(new BorderLayout());

        add(panel);
        add(btnEdit,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}

