package com.dousoftware.kullanlanharfsays;

public class harf {
    public static void main(String[] args) {
        String string = "Türk mareşal, devlet adamı ve Türkiye Cumhuriyeti'nin kurucusu. 1923'ten 1938'deki vefatına kadar arka arkaya 4 kez cumhurbaşkanı seçilen Atatürk, bu görevi en uzun süre yürüten cumhurbaşkanı olmuştur.";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'r')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Metindeki r sayısı: " + count);
    }
}

