package Controller;


import View.ViewDVSlang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;

public class ActionDVSlang implements ActionListener {


    private ViewDVSlang v;
    private Hashtable<String, ArrayList<String>> ds;

    public ActionDVSlang(ViewDVSlang v, Hashtable<String, ArrayList<String>> ds) {
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
        String answer = ds.get(v.getLbl().getText()).toString();
        JLabel lblKQ = new JLabel();
        JFrame confirm = new JFrame();
        confirm.add(lblKQ);
        confirm.setLayout(new FlowLayout());
        switch (cmt){


            case "a" : {
                if (v.getBtna().getText().equals(answer)){
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
                if (v.getBtnb().getText().equals(answer) ){
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
                if (v.getBtnc().getText().equals(answer)){
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
                if (v.getBtnd().getText().equals(answer)){
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
