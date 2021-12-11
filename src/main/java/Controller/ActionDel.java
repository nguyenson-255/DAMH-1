package Controller;


import View.ViewAdd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionDel implements ActionListener {

    private ViewAdd v;
    Hashtable<String , ArrayList<String>> ds;
    public ActionDel(ViewAdd v,Hashtable<String , ArrayList<String>> ds) {
        this.v = v;
        this.ds = ds;

        v.getBtnAdd().addActionListener(this);
        v.getBtnAdd().setActionCommand("Add");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Add"){
            ArrayList<String> temp =new ArrayList<>();
            temp.add(v.getTxtDefine().getText());
            ds.put(v.getTxtSlangword().getText(),temp);
        }

    }
}
