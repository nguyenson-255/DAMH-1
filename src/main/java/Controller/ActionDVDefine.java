package Controller;


import View.ViewDVSlang;
import View.ViewDvDefine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionDVDefine implements ActionListener {


    private ViewDvDefine v;
    private Hashtable<String, ArrayList<String>> ds;

    public ActionDVDefine(ViewDvDefine v, Hashtable<String, ArrayList<String>> ds) {
        this.v = v;
        this.ds = ds;

        v.getBtna().addActionListener(this);
        v.getBtnb().addActionListener(this);
        v.getBtnc().addActionListener(this);
        v.getBtnd().addActionListener(this);

        v.getBtna().setActionCommand("a");
        v.getBtnb().setActionCommand("b");
        v.getBtnc().setActionCommand("c");
        v.getBtnd().setActionCommand("d");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cmt = e.getActionCommand();
        String answer = v.getLbl().getText();
        JLabel lblKQ = new JLabel();
        JFrame confirm = new JFrame();
        confirm.add(lblKQ);
        confirm.setLayout(new FlowLayout());
        System.out.println(answer);
        switch (cmt){

            case "a" : {
                if (ds.get(v.getBtna().getText()).toString().equals(answer)){
                    lblKQ.setText("Correct");
                    confirm.setVisible(true);
                }else {
                    lblKQ.setText("Wrong");
                    confirm.setVisible(true);
                }
                confirm.pack();
                break;
            }
            case "b" : {
                if (ds.get(v.getBtnb().getText()).toString().equals(answer) ){
                    lblKQ.setText("Correct");
                    confirm.setVisible(true);
                }else {
                    lblKQ.setText("Wrong");
                    confirm.setVisible(true);
                }
                confirm.pack();
                break;
            }
            case "c" : {
                if (ds.get(v.getBtnc().getText()).toString().equals(answer)){
                    lblKQ.setText("Correct");
                    confirm.setVisible(true);
                }else {
                    lblKQ.setText("Wrong");
                    confirm.setVisible(true);
                }
                confirm.pack();
                break;
            }
            case "d" : {
                if (ds.get(v.getBtnd().getText()).toString().equals(answer)){
                    lblKQ.setText("Correct");
                    confirm.setVisible(true);
                }else {
                    lblKQ.setText("Wrong");
                    confirm.setVisible(true);
                }
                confirm.pack();
                break;
            }
        }
        v.dispose();
    }
}

