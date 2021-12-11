package View;

import javax.swing.*;
import java.awt.*;

public class ViewConfirmDel extends JFrame {


    private JButton btnCancle , btnOk;
    private JLabel label;

    public JButton getBtnCancle() {
        return btnCancle;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public JLabel getLabel() {
        return label;
    }

    public ViewConfirmDel() throws HeadlessException {
        setTitle("Confirm");
        JPanel panel = new JPanel(new FlowLayout());
        setLayout(new BorderLayout());
        btnCancle = new JButton("Cancel");
        btnOk = new JButton("Ok");
        label = new JLabel("Are You Sure ?");
        panel.add(btnCancle);
        panel.add(btnOk);

        add(label, BorderLayout.PAGE_START);
        add(panel,BorderLayout.LINE_END);

        pack();
        setVisible(true);
    }
}
