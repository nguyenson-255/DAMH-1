package controller;

import io.TextFileFactory;
import model.SlagWord;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller implements ActionListener {
    private View v;
    private ArrayList<SlagWord> ds = new ArrayList<>();



    public Controller(View v) {
        this.v = v;
        ds = TextFileFactory.readFile("slang.txt");
        for (SlagWord e:ds) {
            System.out.println(e.toString());
        }

        v.getBtnSearchSlagword().setActionCommand("SearchSlag");
        v.getBtnSearchSlagword().addActionListener(this);

        v.getBtnSearchDefinition().setActionCommand("SearchDefine");
        v.getBtnSearchDefinition().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        switch (e.getActionCommand()){
            case "SearchSlag":{
                String word = v.getFieldSearchSlagword().getText();
                String[] x = xuLySearchSlag(ds,word);
                break;
            }
            case "SearchDefine":{
                String word = v.getBtnSearchDefinition().getText();
                ArrayList<String> x = xuLySearchDefine(ds,word);
                break;
            }

        }

    }

    private ArrayList<String> xuLySearchDefine(ArrayList<SlagWord> ds, String word) {
        ArrayList<String> Slags =  new ArrayList<>();



        return Slags;

    }

    private String[] xuLySearchSlag(ArrayList<SlagWord> ds, String word) {
        Comparator<SlagWord> c = new Comparator<SlagWord>() {
            @Override
            public int compare(SlagWord o1, SlagWord o2) {
                return o1.getSlag().compareTo(o2.getSlag());
            }
        };
        int idxOfWord = Collections.binarySearch(ds,new SlagWord(word,null),c);
        System.out.println(idxOfWord);
        return ds.get(idxOfWord).getWord();
    }
}
