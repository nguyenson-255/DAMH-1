package main;

import io.TextFileFactory;
import model.SlagWord;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        //load data
        ArrayList<SlagWord> ds = new ArrayList<>();

//        ds.add(new SlagWord("#1",new String[]{"Number one"}));
//        ds.add(new SlagWord("$",new String[]{"Dollar","money"}));
//        ds.add(new SlagWord("$_$",new String[]{"Has money"}));
//        ds.add(new SlagWord("%)",new String[]{"Drunk","giddy"}));
//        ds.add(new SlagWord("&",new String[]{"And"}));
//
//
//        boolean kt  = TextFileFactory.savaFile(ds,"khong.txt");

        ds = TextFileFactory.readFile("khong.txt");
        for (SlagWord e:ds) {
            System.out.println(e.toString());
        }


    }
}
