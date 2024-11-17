package com.muhammet.ornek;

public class RunnerOrnek {
    public static void main(String[] args) {
        /**
         * --- Okul (ad, kapasitesi) - Parent
         * ---- ilkOkul - child
         * ---- ortaOkul - child
         * ---- lise - child
         * SORU: bu sınfları oluşturuyorsunuz. Okul diğer okullara miras bırakıyor.
         * Ancak bir okul oluşturulmak istenildiğinde (new IlkOkul()) mutlaka zorunlu
         * olan alanlar girilmelidir. (ad ve kapasite) new IlkOkul("Atatürk İlk Öğretim Okulul", 560)
         *
         */
        Lise lise = new Lise("Canan Lisesi", 900);
        IlkOkul ilkOkul = new IlkOkul("Tanıma İlk Okulu",430);
    }
}
