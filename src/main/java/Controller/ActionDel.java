package Controller;


import View.ViewAdd;
import View.ViewConfirmDel;
import View.ViewDelete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionDel implements ActionListener {

    private ViewDelete v;
    Hashtable<String , ArrayList<String>> ds;
    public ActionDel(ViewDelete v,Hashtable<String , ArrayList<String>> ds) {
        this.v = v;
        this.ds = ds;

        v.getBtnDelete().addActionListener(this);
        v.getBtnDelete().setActionCommand("Del");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Del"){

            ViewConfirmDel vcd = new ViewConfirmDel();
            ActionConfirmDel acd = new ActionConfirmDel(vcd,ds,v.getTxtSlangword().getText());
            v.dispose();
        }

    }
}
