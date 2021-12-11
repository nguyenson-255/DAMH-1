package Controller;


import View.ViewConfirmDel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionConfirmDel implements ActionListener {

    private ViewConfirmDel v;
    private Hashtable<String, ArrayList<String>> ds;
    private String keySlang;

    public ActionConfirmDel(ViewConfirmDel v, Hashtable<String, ArrayList<String>> ds, String text) {
        this.v = v;
        this.ds = ds;
        keySlang = text;


        v.getBtnOk().addActionListener(this);
        v.getBtnCancle().addActionListener(this);

        v.getBtnCancle().setActionCommand("Can");
        v.getBtnOk().setActionCommand("Ok");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Ok"){
            ds.remove(keySlang);
            v.dispose();
        }else if (e.getActionCommand() == "Can"){
            v.dispose();
        }

    }
}
