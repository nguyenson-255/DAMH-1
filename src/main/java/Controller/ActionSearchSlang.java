package Controller;

import View.ViewSearchSlang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionSearchSlang implements ActionListener {

    private ViewSearchSlang v;
    private Hashtable<String,ArrayList<String>> ds;
    private Hashtable<String,ArrayList<String>> history;

    public ActionSearchSlang(ViewSearchSlang v, Hashtable ds, Hashtable<String, ArrayList<String>> history) {
        this.v = v;
        this.ds =ds;
        this.history = history;

        v.getBtnSearch().addActionListener(this);
        v.getBtnSearch().setActionCommand("Search");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "Search"){
                ArrayList<String> kq = (ArrayList<String>) ds.get(v.getTxtDefine().getText());
                if (kq !=null){
                    String out = "";
                    for (String s: kq) {
                        out+=(s+", ");
                    }
                    v.getLabelKQ().setText(out);

                    history.put(v.getTxtDefine().getText(),kq);
                }



        }


    }
}
