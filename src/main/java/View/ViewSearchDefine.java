package View;


import javax.swing.*;
import java.awt.*;

public class ViewSearchDefine extends JFrame {

    private JButton btnSearch;
    private JTextField txtDefine ;
    private JLabel lblDefine,labelKQ;

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtDefine() {
        return txtDefine;
    }

    public JLabel getLblDefine() {
        return lblDefine;
    }

    public JLabel getLabelKQ() {
        return labelKQ;
    }

    public ViewSearchDefine() throws HeadlessException {

        setTitle("Search Define");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnSearch = new JButton("Search");
        txtDefine = new JTextField(20);
        lblDefine = new JLabel("Definition");
        labelKQ = new JLabel("Not Result");

        panel.add(lblDefine);
        panel.add(txtDefine);
        panel.add(labelKQ);
        setLayout(new BorderLayout());

        add(panel);
        add(btnSearch,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}