package com.example.seguimiento13.model;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtil {

    public static String readFile(){
            String output="";
            File f = new File("contrasena.txt");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String line;
                while((line = reader.readLine()) != null){
                    output += line;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return output.toString();
    }

    public static String readFileTA(){
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
        return output.toString();
    }

    public static void fillPassword(String text){
        File file = new File("contrasena.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fillTA(String text){
        File file = new File("info.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
