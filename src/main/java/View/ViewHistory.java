package View;


import javax.swing.*;
import java.awt.*;

public class ViewHistory extends JFrame{

    private JScrollPane jScrollPane;
    private JTable jTable;
    private JButton btnRefresh;

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    String [] col = {"Slang Word","Definition"};
    Object [][] data = new Object[100][2];

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }

    public JTable getjTable() {
        return jTable;
    }

    public String[] getCol() {
        return col;
    }

    public Object[][] getData() {
        return data;
    }

    public ViewHistory() throws HeadlessException {
        JPanel panel = new JPanel(new FlowLayout());
        setLayout(new BorderLayout());

        jScrollPane = new JScrollPane();
        jTable = new JTable(data,col);
        btnRefresh = new JButton("Refresh");

        jScrollPane.setViewportView(jTable);
        panel.add(jScrollPane);
        panel.setPreferredSize(new Dimension(500,200));


        add(panel,BorderLayout.CENTER);
        add(btnRefresh,BorderLayout.AFTER_LAST_LINE);


        pack();
        setVisible(true);
    }
}
