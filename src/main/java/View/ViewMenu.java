package View;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class ViewMenu extends JFrame {

    private Button btnSearchSlang, btnSearchDefine, btnAdd, btnReset, btnDelete, btnEdit, btnRandom, btnDVSlang, btnDVDefine,btnHistory;

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Button getBtnSearchSlang() {
        return btnSearchSlang;
    }

    public Button getBtnSearchDefine() {
        return btnSearchDefine;
    }

    public Button getBtnReset() {
        return btnReset;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public Button getBtnRandom() {
        return btnRandom;
    }

    public Button getBtnDVSlang() {
        return btnDVSlang;
    }

    public Button getBtnDVDefine() {
        return btnDVDefine;
    }

    public Button getBtnHistory() {
        return btnHistory;
    }

    public ViewMenu() throws HeadlessException {
        setTitle("Menu");
        setLayout(new GridLayout(0,2));
        btnSearchSlang = new Button("Search Slangword");
        btnSearchDefine = new Button("Search Definition");
        btnAdd = new Button("Add Slangword");
        btnHistory = new Button("Show History ");
        btnDelete = new Button("Delete Slangword");
        btnDVDefine = new Button("Do Vui Define");
        btnDVSlang = new Button("Do Vui Slangword");
        btnEdit = new Button("Edit Slangword");
        btnRandom = new Button("Random Slangword");
        btnReset = new Button("Reset Data");



        add(btnSearchSlang);
        add(btnSearchDefine);
        add(btnHistory);
        add(btnAdd);
        add(btnDelete);
        add(btnEdit);
        add(btnRandom);
        add(btnReset);
        add(btnDVDefine);
        add(btnDVSlang);
        pack();
        setVisible(true);
    }
}
