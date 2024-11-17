package com.muhammet.ornek2;

public class RunnerOrnek2 {
    public static void main(String[] args) {
        /**
         * Çalışan (ad,soyad, olusturulmaTarihi, brans)
         * --- Mühendis
         * --- Müdür
         * --- Tekniker
         * --- BüroPersoneli
         * --- InsanKaynakları
         * ----------------------
         * tüm sınıflardan nesne yaratılabilecek. Ancak boş ve parametreli constructor
         * kullanımı yazılımcının istediğine bağlı olacak. brans lar class türüne göre
         * atanacak, programcı branş bilgisini Runner da atayamayacak.
         * new Muhendis();
         * new Muhendis(ad,soyad);
         */
        Muhendis muhendis = new Muhendis();
        System.out.println("branş...: "+ muhendis.getBrans());

        Muhendis muhendis2 = new Muhendis("Muhammet","HOCA");
        System.out.println("ad soyad.....: "+ muhendis2.getAd()+ " "+ muhendis2.getSoyad());
        System.out.println("Branş........: "+ muhendis.getBrans());
    }
}
