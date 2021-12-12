package View;


import javax.swing.*;
import java.awt.*;

public class ViewEdit extends JFrame {

    private JButton btnEdit,btnFind;
    private JTextField txtSlangword;
    private JLabel lblSlang;
    private JTextField txtDefine;
    private JLabel lalDefine;

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JTextField getTxtSlangword() {
        return txtSlangword;
    }

    public JLabel getLblSlang() {
        return lblSlang;
    }

    public JButton getBtnFind() {
        return btnFind;
    }

    public JTextField getTxtDefine() {
        return txtDefine;
    }

    public JLabel getLalDefine() {
        return lalDefine;
    }

    public ViewEdit() throws HeadlessException {

        setTitle("Edit");
        JPanel panel = new JPanel(new GridLayout(0,2));
        JPanel panel1 = new JPanel(new FlowLayout());

        btnEdit = new JButton("Update");
        btnFind = new JButton("Find");

        txtSlangword = new JTextField(20);
        lblSlang = new JLabel("Slang Word");

        txtDefine = new JTextField(20);
        lalDefine = new JLabel("Definition");

        panel1.add(btnFind);
        panel1.add(btnEdit);



        panel.add(lblSlang);
        panel.add(txtSlangword);
        panel.add(lalDefine);
        panel.add(txtDefine);
        setLayout(new BorderLayout());

        add(panel,BorderLayout.CENTER);
        add(panel1,BorderLayout.AFTER_LAST_LINE);
        pack();
        setVisible(true);

    }
}

