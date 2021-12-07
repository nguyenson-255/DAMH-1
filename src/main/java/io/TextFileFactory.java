package io;


import model.SlagWord;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFileFactory {
    public static boolean savaFile(ArrayList<SlagWord> ds,String path)
    {

        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            for (SlagWord e: ds) {
                String line = e.getSlag()+'`';
                for (String word: e.getWord()) {
                    line = line + word+"| ";
                }
                line = line.substring(0,line.length()-2);
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<SlagWord> readFile(String path)
    {
        ArrayList<SlagWord> ds = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line!=null){
                if (line.indexOf("`")!=-1){
                    String[] slagwords = new String[2];
                    slagwords = line.split("`");
                    String[] word = slagwords[1].replace("| ","`").split("`");
                    if (slagwords.length == 2){
                        SlagWord sw = new SlagWord(slagwords[0].trim(),word);
                        ds.add(sw);
                    }
                }else {

                    SlagWord sw = new SlagWord(line,null);
                    ds.add(sw);
                }

                line = br.readLine();
            }

            br.close();
            isr.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ds;
    }

}
