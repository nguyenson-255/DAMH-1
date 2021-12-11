package Controller;

import View.ViewAdd;
import View.ViewConfirmOverwriteAndDuplicate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionAdd implements ActionListener {

    private ViewAdd v;
    Hashtable<String , ArrayList<String>> ds;
    public ActionAdd(ViewAdd v,Hashtable<String , ArrayList<String>> ds) {
        this.v = v;
        this.ds = ds;

        v.getBtnAdd().addActionListener(this);
        v.getBtnAdd().setActionCommand("Add");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Add"){
            ViewConfirmOverwriteAndDuplicate v1 = new ViewConfirmOverwriteAndDuplicate();
            ActionConfirmOWAndDup a1 = new ActionConfirmOWAndDup(v1,ds,v.getTxtSlangword().getText(),v.getTxtDefine().getText());
            v.dispose();
        }

    }
}
