package controller;

import io.TextFileFactory;
import model.SlagWord;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller implements ActionListener {
    private View v;
    private ArrayList<SlagWord> ds = new ArrayList<>();

    private String connectionUrl = "jdbc:mysql://localhost:3306";
    private String username = "root";
    private String password = "";
    private Connection con ;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement st;

    public Controller(View v) throws SQLException {
        this.v = v;
//        ds = TextFileFactory.readFile("slang.txt");

        try {

            if(checkDBExists("SLANGWORDS") != true){
                themDuLieu();
                System.out.println("0");
            }
            else System.out.println("1");

        } catch (SQLException e) {
            e.printStackTrace();
        }



        v.getBtnSearchSlagword().setActionCommand("SearchSlag");
        v.getBtnSearchSlagword().addActionListener(this);

        v.getBtnSearchDefinition().setActionCommand("SearchDefine");
        v.getBtnSearchDefinition().addActionListener(this);
    }

    public boolean checkDBExists(String dbName){

        try {

            System.out.println("Creating a connection...");
            con = DriverManager.getConnection(connectionUrl,username,password);
            stmt =  con.createStatement();

            ResultSet resultSet = con.getMetaData().getCatalogs();

            while (resultSet.next()) {

                String databaseName = resultSet.getString(1);
                if(databaseName.equals(dbName)){
                    return true;
                }
            }
            resultSet.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }

    public void themDuLieu() throws SQLException {
        try {
            stmt.execute("create database SLANGWORDS");
            stmt.execute("use SLANGWORDS");
            stmt.execute("create table search (\n" +
                    "\n" +
                    "\tslang nvarchar(300),\n" +
                    "    word nvarchar(300)\n" +
                    ")\n");

            stmt.execute("create table history (\n" +
                    "\n" +
                    "\tslang nvarchar(300),\n" +
                    "    word nvarchar(300)\n" +
                    ")\n");


        }catch (Exception e){
            e.printStackTrace();
        }

        stmt.execute("use SLANGWORDS");

        String query="";
        int i=0;

        for (SlagWord e:ds) {
            if (e.getWord() != null){
                for (String word: e.getWord()) {
                    try {
                        st = con.prepareStatement("insert into search (slang,word) values (?,?);");
                        st.setString(1, e.getSlag());
                        st.setString(2, word);
                        st.executeUpdate();
                    }catch (Exception ex){
                        System.out.println(word + e.getSlag());
                        ex.printStackTrace();
                    }
                }
            }else {
                query = "insert into search (slang) values ('" + e.getSlag()+"');";
                try {
                    stmt.executeUpdate(query);
                    query="";
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }
        System.out.println("Success");

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        switch (e.getActionCommand()){
            case "SearchSlag":{
                String word = v.getFieldSearchSlagword().getText();

                try {
                    ArrayList<String> x = xuLySearchSlag(word);
                    for (String eo:x) {
                        System.out.println(eo);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                break;
            }
            case "SearchDefine":{
                String word = v.getFieldSearchDefinition().getText();

                int pos = word.indexOf("'");
                if(pos!=-1){
                    word = new StringBuffer(word).insert(pos, "\\").toString();
                    System.out.println(word);
                }

                try {
                    ArrayList<String> x = xuLySearchDefine(word);
                    for (String eo:x) {
                        System.out.println(eo);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                break;
            }

        }

    }

    private ArrayList<String> xuLySearchDefine(String word) throws SQLException {
        ArrayList<String> Slags =  new ArrayList<>();
        String query;

        stmt.execute("use SLANGWORDS");


        query = "select slang from search where word ='"+word+"' ";
        System.out.println(query);
        rs = stmt.executeQuery(query);
        while (rs.next()){
            Slags.add(rs.getString("slang"));
        }

        return Slags;
    }


    private ArrayList<String> xuLySearchSlag(String word) throws SQLException {
        ArrayList<String> Slags =  new ArrayList<>();
        String query;

        stmt.execute("use SLANGWORDS");
        query = "select word from search where slang = '"+word+"';";
        System.out.println(query);
        rs = stmt.executeQuery(query);
        while (rs.next()){
            Slags.add(rs.getString("word"));
        }
        for (String slang: Slags) {
            query = "insert into history (slang,word) values ('"+word+"','"+slang+"')";
            stmt.executeUpdate(query);
        }
        return Slags;
    }
}
