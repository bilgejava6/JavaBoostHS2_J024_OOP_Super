package com.muhammet.ornek2;

public class Calisan {
    private String ad;
    private String soyad;
    private String brans;
    private Long olusturulmaTarihi;

    public Calisan(String ad, String soyad, String brans){
        this.ad = ad;
        this.brans = brans;
        this.soyad = soyad;

    }

    public Calisan(String brans){
        this.brans = brans;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBrans() {
        return brans;
    }


    public Long getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Long olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }
}
