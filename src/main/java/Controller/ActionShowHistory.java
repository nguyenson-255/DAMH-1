package Controller;


import View.ViewHistory;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionShowHistory implements ActionListener {

    private ViewHistory v;
    private Hashtable<String, ArrayList<String>> history;
    private String [] col = {"Slang Word","Definition"};


    public ActionShowHistory(ViewHistory v, Hashtable<String, ArrayList<String>> history) {
        this.v = v;
        this.history = history;

        v.getBtnRefresh().addActionListener(this);
        v.getBtnRefresh().setActionCommand("Ref");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Ref"){
            if (!history.isEmpty()){
                int numCol = 2;
                int numRow = history.size();
                Object [][] data = new Object[numRow][];

                int i=0;
                for (String str: history.keySet()) {
                    Object [] temp = new Object[numCol];
                    String values = "";


                    for (String str1: history.get(str)) {
                        values += str1 + " , ";
                    }

                    temp[0] = str;
                    temp[1] = values;

                    data[i] = temp;

                    i++;
                    System.out.println(str);
                }

                v.getjTable().setModel(new DefaultTableModel(data,col));

            }
        }




    }
}
