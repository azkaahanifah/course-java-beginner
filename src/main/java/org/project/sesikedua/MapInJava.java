package org.project.sesikedua;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
    public static void main (String[] args) {
        /**
         * MAP
         * - menyimpan pasangan nilai kunci (key, value)
         * Analogi seperti didalam kamus:
         * 1. Bahasa Inggris -> key (gak boleh duplicate)
         * 2. Bahasa Indonesia -> value
         */

        //1. Inisialisasi
        java.util.Map<String, String> kamus = new HashMap<>();

        //2. Menambahkan elemen
        kamus.put("banana", "pisang");
        kamus.put("orange", "jeruk");
        kamus.put("mango", "mangga");

        //3. Mengambil element berdasarkan key dan value
        /*
        Kalau berdasarkan KEY, maka variabel yang menampung nilai tipe datanya disesuikan dengan tipe data Value
         */
        String artiJeruk = kamus.get("orange");

         /*
        Kalau berdasarkan VALUE, maka variabel yg menampung nilai tipe datanya disesuikan dengan tipe data Key
         */
        String dalamBahasaInggris = kamus.get("jeruk");

        //Mengetahui apakah suatu collection mengandung element tertentu
        if (kamus.containsKey("banana")) {
            System.out.println(kamus.get("banana"));
        }
        if (kamus.containsValue("jeruk")) {
            System.out.println(kamus.get("jeruk"));
        }

        //ITERASI//////////////////////////////////////////////

        //4. Iterasi

        //4.1 Menggunakan keySet
        for (String key : kamus.keySet()) {
            System.out.println("Key: " + key + "valuenya adalah: " + kamus.get(key));
        }

        //4.2 Menggunakan entrySet
        for (java.util.Map.Entry<String, String> entry : kamus.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "valuenya adalah: " + entry.getValue());
        }

        //4.3 Menggunakan lambda expression
        kamus.forEach((key, value) -> {
            System.out.println("Key: " + key + "valuenya adalah: " + value);
        });

    }
}
