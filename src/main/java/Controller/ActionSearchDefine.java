package Controller;


import View.ViewSearchDefine;
import View.ViewSearchSlang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionSearchDefine implements ActionListener {

    private ViewSearchDefine v;
    private Hashtable<String, ArrayList<String>> ds;

    public ActionSearchDefine(ViewSearchDefine v,Hashtable ds) {
        this.v = v;
        this.ds =ds;

        v.getBtnSearch().addActionListener(this);
        v.getBtnSearch().setActionCommand("Search");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "Search"){

            ArrayList<String> ds1 = new ArrayList<>();
            ds1.add(v.getTxtDefine().getText());

            System.out.println(ds.containsValue(ds1));


//            ArrayList<String> kq = (ArrayList<String>) ds.get(v.getTxtDefine().getText());
//
//
//
//            System.out.println(v.getTxtDefine().getText());
//            String out = "";
//            for (String s: kq) {
//                out+=(s+", ");
//            }
//            v.getLabelKQ().setText(out);
//            System.out.println(out);
        }


    }
}
