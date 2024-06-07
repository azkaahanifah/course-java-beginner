package org.project.sesipertama;

public class Looping {
    public static void main(String[] args) {
        /**
         * WHILE
         */
        int count = 1;

        while (count <= 5) { //PROGRAM AKAN TERUS BERULANG SELAMA KONDISI "WHILE" TERPENUHI
            System.out.println("Iteration " + count);
            count++; //INI SAMA DENGAN count + 1
        }

        /**
         * DO..WHILE
         * 1. Jalankan blok kode terlebih dahulu, setelah itu baru dicek kondisinya
         * 2. Jika kondisi terpenuhi, maka ulangi program (kembali ke poin 1)
         * 3. Jika kondisi tidak terpenuhi, maka STOP PERULANGAN
         */
        int number = 10;

        do {
            System.out.println("Number: " + number);
            number--; //INI SAMA DENGAN number - 1
        } while (number >= 0);

        /**
         * FOR
         *
         * RUMUS :
         * for (inisialisasi; kondisi yang akan diperiksa; perubahan;) { //blok kode }
         *
         * inisialisasi => tipeData namaVariable = nilaiAwal
         * NOTE: namaVariable bertindak sebagai counter atau penghitung iterasi/perulangan
         */

        /*
        KETERANGAN :
        1. int i = 0; => inisialisasi/kondisi awal
        2. i < 5; => kondisi yang akan dicek
        3. i++; => pernyataan yang dijalankan setelah setiap perulangan atau perubahan
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop: " + i);
        }

        /**
         * FOR..EACH
         *
         * RUMUS :
         * for (elemen namaVariabelBaru : namaCollectionYangAkanDiIterasi) { //blok kode }
         *
         */
        String[] names = {"Azka", "Yonki", "Boma", "Ilham", "Daniya", "Ary"};
        for (String name : names) {
            System.out.println("Hello: " + name);
        }

        //JIKA INGIN MENGGUNAKAN FOR

        //KETAHUI DULU UKURAN COLLECTION
        int lengthOfNames = names.length;

        for (int i = 5; i < lengthOfNames; i++) {
            String name = names[i];
            System.out.println("Hello For: " + name);
        }

    }
}
