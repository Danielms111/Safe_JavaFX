package com.example.seguimiento13.model;

public class safeData {
    //Formato del singleton
    private static safeData instance;

    private safeData(){
        password = new Password("000000");
    }

    public static safeData getInstance(){
        if(instance==null){
            instance = new safeData();
        }
        return instance;
    }

    //Los atributos de la clase
    public Password password;

    public Password getPassword(){
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
