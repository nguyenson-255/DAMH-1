package Controller;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

import static io.TextFileFactory.readFile;

public class ActionMenu implements ActionListener {

    private Hashtable <String,ArrayList<String>> ds;

    private ViewMenu v;

    private ViewAdd vadd;
    private ViewDelete vdel;
    private ViewEdit vedit;
    private ViewDvDefine viewDvDefine;
    private ViewDVSlang viewDVSlang;
    private ViewRandomSlang viewRandomSlang;
    private ViewSearchDefine viewSearchDefine;
    private ViewSearchSlang viewSearchSlang;
    private ViewHistory viewHistory;






    public ActionMenu(ViewMenu v) {
        this.v =  v;
        ds = new Hashtable<String, ArrayList<String>>();

        v.getBtnAdd().addActionListener(this);
        v.getBtnAdd().setActionCommand("Add");
        v.getBtnSearchDefine().addActionListener(this);
        v.getBtnSearchDefine().setActionCommand("Search Define");
        v.getBtnSearchSlang().addActionListener(this);
        v.getBtnSearchSlang().setActionCommand("Search Slang");
        v.getBtnHistory().addActionListener(this);
        v.getBtnHistory().setActionCommand("History");
        v.getBtnDelete().addActionListener(this);
        v.getBtnDelete().setActionCommand("Delete");
        v.getBtnEdit().addActionListener(this);
        v.getBtnEdit().setActionCommand("Edit");
        v.getBtnReset().addActionListener(this);
        v.getBtnReset().setActionCommand("Reset");
        v.getBtnRandom().addActionListener(this);
        v.getBtnRandom().setActionCommand("Random");
        v.getBtnDVDefine().addActionListener(this);
        v.getBtnDVDefine().setActionCommand("DV Define");
        v.getBtnDVSlang().addActionListener(this);
        v.getBtnDVSlang().setActionCommand("DV Slang");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cmt = e.getActionCommand();


        switch (cmt){
            case "Add":{
                vadd = new ViewAdd();
                ActionAdd a =new ActionAdd(vadd,ds);
                break;
            }
            case "Search Define":{
                viewSearchDefine = new ViewSearchDefine();
                ActionSearchDefine c = new ActionSearchDefine(viewSearchDefine,ds);
                break;
            }
            case "Search Slang":{
                viewSearchSlang  = new ViewSearchSlang();
                ActionSearchSlang c = new ActionSearchSlang(viewSearchSlang,ds);
                break;
            }
            case "History":{
                viewHistory = new ViewHistory();
                break;
            }
            case "Edit":{
                vedit = new ViewEdit();
                break;
            }
            case "Reset":{
                ds = readFile("src/main/java/io/slang.txt");
                System.out.println("Success");


                Set key = ds.keySet();
                Collection value = ds.values();

                System.out.println(key);
                System.out.println(value);


                break;
            }
            case "Random":{
                viewRandomSlang = new ViewRandomSlang();
                break;
            }
            case "Delete":{
                vdel = new ViewDelete();
                break;
            }
            case "DV Define":{
                viewDvDefine = new ViewDvDefine();
                break;
            }
            case "DV Slang":{
                viewDVSlang = new ViewDVSlang();
                break;
            }
        }



    }


}