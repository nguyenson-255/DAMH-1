package Controller;


import View.ViewRandomSlang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class ActionRandom implements ActionListener {

    private ViewRandomSlang vrs;
    Hashtable<String, ArrayList<String>> ds;


    public ActionRandom(ViewRandomSlang vrs, Hashtable ds) {
        this.vrs = vrs;
        this.ds = ds;

        vrs.getBtnAdd().addActionListener(this);
        vrs.getBtnAdd().setActionCommand("Random");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Random"){

            String[] keys = ds.keySet().toArray(new String[ds.size()]);

            String key = keys[new Random().nextInt(keys.length)];

            String values = ds.get(key).toString();

            vrs.getTxtSlangword().setText(key);
            vrs.getTxtDefine().setText(values);
        }
    }
}
