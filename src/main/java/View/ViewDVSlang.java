package View;


import javax.swing.*;
import java.awt.*;

public class ViewDVSlang extends JFrame {

    private JButton btna,btnb,btnc,btnd,btnFind;
    private JLabel lbl;

    public ViewDVSlang() throws HeadlessException {
        JPanel panel = new JPanel(new GridLayout(2,2));
        btna = new JButton("0");
        btnb = new JButton("1");
        btnc = new JButton("2");
        btnd = new JButton("3");
        panel.add(btna);
        panel.add(btnb);
        panel.add(btnc);
        panel.add(btnd);
        lbl = new JLabel("Cau Hoi");
        lbl.setSize(25,10);

        setLayout(new BorderLayout());

        add(lbl,BorderLayout.PAGE_START);
        add(panel,BorderLayout.CENTER);
        setPreferredSize(new Dimension(700,100));
        pack();
        setVisible(true);

    }

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
}
