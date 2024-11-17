package com.muhammet.entity;

import java.util.UUID;

public class Arac {
    private String uuid;
    public String yakitTuru;
    public int kapasite;
    public int hiz;

    public Arac(){
        System.out.println("Araç Constructor");
    }

    public Arac(String yakitTuru){
        System.out.println("Parametreli Araç Constructor");
        uuid = UUID.randomUUID().toString();
        this.yakitTuru = yakitTuru;
    }



    public String getUuid(){
        return uuid;
    }
}
