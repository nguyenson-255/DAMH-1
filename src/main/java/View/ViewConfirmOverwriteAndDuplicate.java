package View;


import javax.swing.*;
import java.awt.*;

public class ViewConfirmOverwriteAndDuplicate extends JFrame {


    private JButton btnOverWrite , btnDup;
    private JLabel label;

    public JButton getbtnOverWrite() {
        return btnOverWrite;
    }

    public JButton getbtnDup() {
        return btnDup;
    }

    public JLabel getLabel() {
        return label;
    }

    public ViewConfirmOverwriteAndDuplicate() throws HeadlessException {
        setTitle("Confirm");
        JPanel panel = new JPanel(new FlowLayout());
        setLayout(new BorderLayout());
        btnOverWrite = new JButton("Over Write");
        btnDup = new JButton("Duplicate");
        label = new JLabel("What are you want ?");
        panel.add(btnOverWrite);
        panel.add(btnDup);

        add(label, BorderLayout.PAGE_START);
        add(panel,BorderLayout.LINE_END);

        pack();
        setVisible(true);
    }
}

