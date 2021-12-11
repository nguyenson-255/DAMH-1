package Controller;


import View.ViewConfirmOverwriteAndDuplicate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionConfirmOWAndDup implements ActionListener {

    private ViewConfirmOverwriteAndDuplicate v;
    private Hashtable<String, ArrayList<String>> ds;
    private String keySlang;
    private ArrayList<String> valueSlang = new ArrayList<>();

    public ActionConfirmOWAndDup(ViewConfirmOverwriteAndDuplicate v, Hashtable<String, ArrayList<String>> ds, String text, String s) {
        this.v = v;
        this.ds = ds;
        keySlang = text;
        valueSlang.add(s);


        v.getbtnOverWrite().addActionListener(this);
        v.getbtnDup().addActionListener(this);

        v.getbtnOverWrite().setActionCommand("OW");
        v.getbtnDup().setActionCommand("DUP");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "OW"){
            ds.put(keySlang,valueSlang);
            v.dispose();
        }
        else if (e.getActionCommand() == "DUP"){
            if (ds.containsKey(keySlang) == true){

                ArrayList temp = ds.get(keySlang);
                valueSlang.addAll(temp);
                ds.put(keySlang,valueSlang);
            }else {
                ds.put(keySlang,valueSlang);
            }
            v.dispose();
        }

    }
}
