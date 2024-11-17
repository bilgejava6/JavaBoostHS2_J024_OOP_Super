package com.muhammet.entity;


public class Ucak extends Arac{
    public int kanatUzunlugU;

    /**
     * Super,
     * bir sınıf miras aldığı sınıfın constructor unu
     * kendi constructor u içerisinde çağırır. Bu işlemi
     * yapmak için super() methodunu tetikler.
     * -- super() methodundan önce kodlama yazılamaz.
     */
    public Ucak(){
        super("Uçak Yakıtı");
        System.out.println("Uçak constructor");
    }


}
