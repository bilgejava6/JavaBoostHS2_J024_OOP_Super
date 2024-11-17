package com.muhammet;

import com.muhammet.entity.Araba;
import com.muhammet.entity.Ucak;

public class Runner {
    public static void main(String[] args) {
        Ucak ucak = new Ucak();
        Araba araba = new Araba();
        //ucak.uuid = "1";
        System.out.println("uçak id.....: "+ucak.getUuid());
        System.out.println("araba id.....: "+araba.getUuid());
        System.out.println("uçağın yakıt türü...: "+ ucak.yakitTuru);
        System.out.println("arabanın yakıt türü...: "+ araba.yakitTuru);

    }
}