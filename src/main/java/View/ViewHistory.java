package View;


import javax.swing.*;
import java.awt.*;

public class ViewHistory extends JFrame{

    private JScrollPane jScrollPane;
    private JTable jTable;
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
        jScrollPane = new JScrollPane();
        jTable = new JTable(data,col);
        jScrollPane.setViewportView(jTable);
        jScrollPane.setPreferredSize(new Dimension(300,200));
        add(jScrollPane);
        setLayout(new FlowLayout());
        pack();
        setVisible(true);
    }
}
