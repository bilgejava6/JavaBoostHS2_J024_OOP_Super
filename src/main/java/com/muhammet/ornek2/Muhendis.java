package com.muhammet.ornek2;

public class Muhendis extends Calisan{
    private String yetkinlikUnvani;

    public Muhendis(){
        super("Mühendis");
    }

    public Muhendis(String ad,String soyad){
        super(ad,soyad,"Mühendis");
    }
}
