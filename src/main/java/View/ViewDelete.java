package View;


import javax.swing.*;
import java.awt.*;

public class ViewDelete extends JFrame {

    private JButton btnDelete;
    private JTextField txtSlangword;
    private JLabel lblSlang;

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JTextField getTxtSlangword() {
        return txtSlangword;
    }

    public JLabel getLblSlang() {
        return lblSlang;
    }

    public ViewDelete() throws HeadlessException {

        setTitle("Delete");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnDelete = new JButton("Delete");
        txtSlangword = new JTextField(20);
        lblSlang = new JLabel("Slang Word");

        panel.add(lblSlang);
        panel.add(txtSlangword);

        setLayout(new BorderLayout());

        add(panel);

        add(btnDelete,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}
