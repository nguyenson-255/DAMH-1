package Controller;


import View.ViewEdit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionEdit implements ActionListener {

    private ViewEdit v;
    private Hashtable<String, ArrayList<String>> ds;

    public ActionEdit(ViewEdit v, Hashtable<String, ArrayList<String>> ds) {
        this.v = v;
        this.ds = ds;

        v.getBtnFind().addActionListener(this);
        v.getBtnEdit().addActionListener(this);

        v.getBtnEdit().setActionCommand("E");
        v.getBtnFind().setActionCommand("F");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "E"){

            ArrayList<String> words = new ArrayList<>();
            String[] temp = v.getTxtDefine().getText().split(",");

            for (String t:temp) {
                words.add(t.strip());
            }
            ds.put(v.getTxtSlangword().getText(),words);

            v.dispose();

        }else if (e.getActionCommand() == "F"){

            ArrayList<String> temp = ds.get(v.getTxtSlangword().getText());

            String str = "" ;
            for (String t:temp) {
                if (t == temp.get(temp.size()-1)){
                    str+=t;
                    break;
                }
                str+=t+" , ";
            }
            v.getTxtDefine().setText(str);
        }
    }
}
