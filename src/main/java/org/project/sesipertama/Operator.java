package org.project.sesipertama;

public class Operator {
    public static void main (String[] args) {
        /**
         * OPERATOR ARITMATIKA
         *
         * Syarat: TIPE DATA HARUS SAMA
         * Jika tipe data tidak sama, maka bisa dilakukan konversi
         * Bisa dicek disini: https://www.codecademy.com/resources/docs/java/type-conversion
         */

        int a = 3;
        int b = 4;
        int c = 8;
        int d = 5;

        //Penjumlahan
        int hasilPenjumlahan = a + b;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        //Pengurangan
        int hasilPengurangan = a - b;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        //Perkalian
        int hasilPerkalian = a * c;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        //Pembagian
        int hasilPembagian = c / b;
        System.out.println("Hasil pembagian: " + hasilPembagian);

        //Modulus
        int hasilModulus = d % a;
        System.out.println("Hasil modulus: " + hasilModulus);

        /**
         * OPERATOR RELASIONAL
         * - Digunakan untuk membandingkan dua nilai
         * - Karena digunakan untuk perbandingan, maka hasil perbandingannya antara bernilai BENAR atau SALAH
         */

        //Sama Dengan `==`
        boolean isSamaDengan = (a == b);
        System.out.println("Hasil perbandingan sama dengan: " + isSamaDengan);

        //Tidak Sama Dengan `!=`
        boolean isTidakSamaDengan = (a != b);
        System.out.println("Hasil perbandingan tidak sama dengan: " + isTidakSamaDengan);

        //Lebih Besar `>`
        boolean isLebihBesar = (c > d);
        System.out.println("Hasil perbandingan lebih besar dari: " + isLebihBesar);

        //Lebih Kecil `<`
        boolean isLebihKecil = (c < b);
        System.out.println("Hasil perbandingan lebih kecil dari: " + isLebihKecil);

        //Lebih Besar atau Sama Dengan `>`
        boolean isLebihBesarAtauSamaDengan = (c >= d);
        System.out.println("Hasil perbandingan lebih besar dari: " + isLebihBesarAtauSamaDengan);

        //Lebih Kecil atau Sama Dengan `<`
        boolean isLebihKecilAtauSamaDengan = (c <= b);
        System.out.println("Hasil perbandingan lebih kecil dari: " + isLebihKecilAtauSamaDengan);

        /**
         * OPERATOR LOGIKA
         */

        boolean isA = true;
        boolean isB = false;

        //Logika `DAN/AND` ( && )
        boolean isAND = isA && isB;
        System.out.println("Hasil logika AND: " + isAND);

        //Logika `ATAU/OR` ( || )
        boolean isOR = isA || isB;
        System.out.println("Hasil logika OR: " + isOR);

        /**
         * OPERATOR INCREMENT
         * - Digunakan untuk menambah nilai variabel sebanyak 1
         */
        int e = 9;

        /*
        RUMUS: variabel++;
         */
        e++;
        System.out.println("Hasil increment: " + e);

        /**
         * OPERATOR DECREMENT
         * - Digunakan untuk mengurangi nilai variabel sebanyak 1
         */
        int f = 9;

        /*
        RUMUS: variabel--;
         */
        f--;
        System.out.println("Hasil decrement: " + f);

        /**
         * OPERATOR TERNARY (KONDISIONAL)
         *
         * RUMUS: hasil = condition ? valueIfTrue : valueIfElse
         */
        int hasilTernaryOperator = (a > b) ? c : d;
        System.out.println("Hasil ternary operator: " + hasilTernaryOperator);
    }
}
