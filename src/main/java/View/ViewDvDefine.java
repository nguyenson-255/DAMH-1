package View;


import javax.swing.*;
import java.awt.*;

public class ViewDvDefine extends JFrame {

    private JButton btna,btnb,btnc,btnd;
    private JLabel lbl;

    public JButton getBtna() {
        return btna;
    }

    public JButton getBtnb() {
        return btnb;
    }

    public JButton getBtnc() {
        return btnc;
    }

    public JButton getBtnd() {
        return btnd;
    }

    public JLabel getLbl() {
        return lbl;
    }

    public ViewDvDefine() throws HeadlessException {
        JPanel panel = new JPanel(new GridLayout(2,2));
        btna = new JButton("Cau A");
        btnb = new JButton("Cau A");
        btnc = new JButton("Cau A");
        btnd = new JButton("Cau A");
        panel.add(btna);
        panel.add(btnb);
        panel.add(btnc);
        panel.add(btnd);
        lbl = new JLabel("Cau Hoi");

        setLayout(new BorderLayout());

        add(lbl,BorderLayout.PAGE_START);
        add(panel,BorderLayout.CENTER);
        pack();
        setVisible(true);

    }
}
