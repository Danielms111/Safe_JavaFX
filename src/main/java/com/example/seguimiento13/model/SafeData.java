package com.example.seguimiento13.model;

import java.io.*;

public class SafeData {
    //Formato del singleton
    private static SafeData instance;

    private SafeData(){
        information = new Info("");
    }

    public static SafeData getInstance(){
        if(instance==null){
            instance = new SafeData();
            String output="";
            File f = new File("info.txt");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String line;
                while((line = reader.readLine()) != null){
                    output += line + "\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Info newInfo = new Info(output);
            instance.setInfo(newInfo);
        }
        return instance;
    }

    //Los atributos de la clase
    public Info information;

    public Info getInfo(){
        return information;
    }

    public void setInfo(Info information) {
        this.information = information;
    }
}
