package io;



import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class TextFileFactory {
//    public static boolean savaFile(Hashtable<String,ArrayList<String>> ds, String path)
//    {
//
//        try {
//            FileOutputStream fos = new FileOutputStream(path);
//            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//            BufferedWriter bw = new BufferedWriter(osw);
//
//            for (SlagWord e: ds) {
//                String line = e.getSlag()+'`';
//                for (String word: e.getWord()) {
//                    line = line + word+"| ";
//                }
//                line = line.substring(0,line.length()-2);
//                bw.write(line);
//                bw.newLine();
//            }
//            bw.close();
//            osw.close();
//            fos.close();
//
//            return true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return false;
//    }

    public static Hashtable<String,ArrayList<String>> readFile(String path)
    {
        Hashtable<String,ArrayList<String>> ds  = new Hashtable<String,ArrayList<String>>();

        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line!=null){
                ArrayList<String> words = new ArrayList<>();
                if (line.indexOf("`")!=-1){
                    String[] slagwords = new String[2];
                    slagwords = line.split("`");
                    String[] word = slagwords[1].replace("| ","`").split("`");

                    if (slagwords.length == 2 ){
                        if (ds.containsKey(slagwords[0].trim()) == false){
                            for (String e: word) {
                                words.add(e);
                            }
                            ds.put(slagwords[0].trim(),words);
                        }
                        else {
                            ArrayList<String> temp = ds.get(slagwords[0].trim());
                            for (String e: word) {
                                words.add(e);
                            }
                            words.addAll(temp);
                            ds.put(slagwords[0].trim(),words);
                        }

                    }
                }else {
                    ds.put(line,words);
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
