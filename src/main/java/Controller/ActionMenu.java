package Controller;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import static io.TextFileFactory.readFile;

public class ActionMenu implements ActionListener {

    private Hashtable <String,ArrayList<String>> ds;
    private Hashtable <String,ArrayList<String>> history;


    private ViewMenu v;

    private ViewAdd vadd;
    private ViewDelete vdel;
    private ViewEdit vedit;
    private ViewDvDefine viewDvDefine;
    private ViewRandomSlang viewRandomSlang;
    private ViewSearchDefine viewSearchDefine;
    private ViewSearchSlang viewSearchSlang;
    private ViewHistory viewHistory;
    private ViewDVSlang viewDVSlang;


    public ActionMenu(ViewMenu v) {
        this.v =  v;
        ds = new Hashtable<String, ArrayList<String>>();
        history = new Hashtable<String, ArrayList<String>>();


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
                ActionSearchSlang c = new ActionSearchSlang(viewSearchSlang,ds,history);
                break;
            }
            case "History":{
                viewHistory = new ViewHistory();
                ActionShowHistory ash = new ActionShowHistory(viewHistory,history);
                break;
            }
            case "Edit":{
                vedit = new ViewEdit();
                ActionEdit ae = new ActionEdit(vedit,ds);
                break;
            }
            case "Reset":{
                ds = readFile("src/main/java/io/slang.txt");
                System.out.println("Success");

                Set key = ds.keySet();
                Collection value = ds.values();

//                System.out.println(key);
//                System.out.println(value);


                break;
            }
            case "Random":{
                viewRandomSlang = new ViewRandomSlang();
                ActionRandom a = new ActionRandom(viewRandomSlang,ds);
                break;
            }
            case "Delete":{
                vdel = new ViewDelete();
                ActionDel ad = new ActionDel(vdel,ds);
                break;
            }
            case "DV Define":{
                viewDvDefine =xuLyRandomDefineQuestion(ds);
                ActionDVDefine a = new ActionDVDefine(viewDvDefine,ds);
                break;
            }
            case "DV Slang":{
                viewDVSlang = xuLyRandomQuestion(ds);
                ActionDVSlang a = new ActionDVSlang(viewDVSlang,ds);
                break;
            }
        }



    }

    private ViewDvDefine xuLyRandomDefineQuestion(Hashtable<String, ArrayList<String>> ds) {
        ViewDvDefine v = new ViewDvDefine();
        String[] keys = ds.keySet().toArray(new String[ds.size()]);

        String key,values;

        int j = new Random().nextInt(4);

        for (int i=0;i<4;i++){

            key = keys[new Random().nextInt(keys.length)];
            values = ds.get(key).toString();
            if (i==j){
                v.getLbl().setText(values);
            }

            switch (i){
                case 0:{
                    v.getBtna().setText(key);
                    break;
                }
                case 1:{
                    v.getBtnb().setText(key);
                    break;
                }
                case 2:{
                    v.getBtnc().setText(key);
                    break;
                }
                case 3:{
                    v.getBtnd().setText(key);
                    break;
                }
            }

        }


        return v;
    }

    public static ViewDVSlang xuLyRandomQuestion(Hashtable<String, ArrayList<String>> ds) {
        ViewDVSlang v = new ViewDVSlang();
        String[] keys = ds.keySet().toArray(new String[ds.size()]);

        String key,values;

        int j = new Random().nextInt(4);
        
        for (int i=0;i<4;i++){

            key = keys[new Random().nextInt(keys.length)];
            values = ds.get(key).toString();
            if (i==j){
                v.getLbl().setText(key);
           }

            switch (i){
                case 0:{
                    v.getBtna().setText(values);
                    break;
                }
                case 1:{
                    v.getBtnb().setText(values);
                    break;
                }
                case 2:{
                    v.getBtnc().setText(values);
                    break;
                }
                case 3:{
                    v.getBtnd().setText(values);
                    break;
                }
            }

       }


        return v;
    }


}
