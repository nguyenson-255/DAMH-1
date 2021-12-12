package View;


import javax.swing.*;
import java.awt.*;

public class ViewSearchSlang extends JFrame {

    public JLabel getLabelKQ() {
        return labelKQ;
    }

    private JLabel labelKQ;
    private JButton btnSearch;
    private JTextField txtDefine ;
    private JLabel lblDefine;

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtDefine() {
        return txtDefine;
    }

    public JLabel getLblDefine() {
        return lblDefine;
    }

    public ViewSearchSlang() throws HeadlessException {

        setTitle("Search Slangword");
        JPanel panel = new JPanel(new GridLayout(0,2));
        btnSearch = new JButton("Search");
        txtDefine = new JTextField(20);
        lblDefine = new JLabel("Slang Word");
        labelKQ = new JLabel("Not Result");

        panel.add(lblDefine);
        panel.add(txtDefine);
        panel.add(labelKQ);
        setLayout(new BorderLayout());

        add(panel);
        add(btnSearch,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension(300,50));

    }
}
