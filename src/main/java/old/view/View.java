package view;


import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class View extends JFrame {

    String[] col = {"SlangWords","Definition"};
    Object[][] data = new Object[100][10] ;

    private JLabel LableSearchSlagword;

    private JTextField FieldSearchSlagword;

    private JButton btnSearchSlagword;

    private JLabel LableSearchDefinition;

    private JTextField FieldSearchDefinition;

    private JButton btnSearchDefinition;

    private JScrollPane jsbHistory;

    private JTable jTableHistory;

    JPanel panelSearchSlagword;
    JPanel panelSearchDefinition;
    JPanel panelShowHistory;


    public View() throws HeadlessException {

        // Chức năng 1 : Chức năng tìm kiếm theo slang word.
        panelSearchSlagword = new JPanel(new FlowLayout());

        btnSearchSlagword = new JButton("Search");
        LableSearchSlagword = new JLabel("Search SlagWord: ");
        FieldSearchSlagword = new JTextField(20);

        panelSearchSlagword.add(LableSearchSlagword);
        panelSearchSlagword.add(FieldSearchSlagword);
        panelSearchSlagword.add(btnSearchSlagword);

        // Chức năng 2: Chức năng tìm kiếm theo definition
        panelSearchDefinition = new JPanel(new FlowLayout());

        btnSearchDefinition = new JButton("Search");
        LableSearchDefinition = new JLabel("Search Definition: ");
        FieldSearchDefinition = new JTextField(20);

        panelSearchDefinition.add(LableSearchDefinition);
        panelSearchDefinition.add(FieldSearchDefinition);
        panelSearchDefinition.add(btnSearchDefinition);

        // Chức năng 3 : hiển thị History các Slag Word

        panelShowHistory = new JPanel(new FlowLayout());

        jTableHistory = new JTable(data,col);

        jsbHistory = new JScrollPane();

        jsbHistory.setViewportView(jTableHistory);
        jsbHistory.setPreferredSize(new Dimension(300,300));


        panelShowHistory.add(jsbHistory);

//        add(panelSearchSlagword);
//        add(panelSearchDefinition,BorderLayout.CENTER);
        add(panelShowHistory);



//        setLayout(new BorderLayout());
//        setSize(800,800);
        pack();
        setVisible(true);
    }

    public JTextField getFieldSearchSlagword() {
        return FieldSearchSlagword;
    }

    public JButton getBtnSearchSlagword() {
        return btnSearchSlagword;
    }

    public JTextField getFieldSearchDefinition() {
        return FieldSearchDefinition;
    }

    public JButton getBtnSearchDefinition() {
        return btnSearchDefinition;
    }

}
