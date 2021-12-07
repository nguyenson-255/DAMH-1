package view;


import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private JLabel LableSearchSlagword;

    private JTextField FieldSearchSlagword;

    private JButton btnSearchSlagword;

    private JLabel LableSearchDefinition;

    private JTextField FieldSearchDefinition;

    private JButton btnSearchDefinition;

    Panel panelSearchSlagword;
    Panel panelSearchDefinition;


    public View() throws HeadlessException {

        // Chức năng 1 : Chức năng tìm kiếm theo slang word.
        panelSearchSlagword = new Panel(new FlowLayout());

        btnSearchSlagword = new JButton("Search");
        LableSearchSlagword = new JLabel("Search SlagWord: ");
        FieldSearchSlagword = new JTextField(20);

        panelSearchSlagword.add(LableSearchSlagword);
        panelSearchSlagword.add(FieldSearchSlagword);
        panelSearchSlagword.add(btnSearchSlagword);

        // Chức năng 2: Chức năng tìm kiếm theo definition
        panelSearchDefinition = new Panel(new FlowLayout());

        btnSearchDefinition = new JButton("Search");
        LableSearchDefinition = new JLabel("Search Definition: ");
        FieldSearchDefinition = new JTextField(20);

        panelSearchDefinition.add(LableSearchDefinition);
        panelSearchDefinition.add(FieldSearchDefinition);
        panelSearchDefinition.add(btnSearchDefinition);


        add(panelSearchSlagword);
//        add(panelSearchDefinition);
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
