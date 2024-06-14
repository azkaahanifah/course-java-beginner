package org.project.sesikedua;

public class ArrayInJava {
    public static void main(String[] args) {
        /**
         * ARRAYS
         *
         * SYARAT :
         * 1. Tipe data seragam
         * 2. Ukuran tetap (?)
         *
         * DEKLARASI ARRAY
         * => tipeData[] namaVariabel = new tipeData[jumlahElemenDalamArray]
         *
         * INISIALISASI ARRAY
         * => tipeData[] namaVariabel = {elemen-1, elemen-2, dst}
         */

        //int[] numberss = {10, 11, 12, 45};

        //////////////////////////////////////////////////////////////////////////////

        //1. Deklarasi Array
        /*
        Membuat sebuah objek baru menggunakan kata kunci NEW
         */
        int[] numbers = new int[2];

        //2. Memperbarui Element
        numbers[1] = 10;
        numbers[2] = 3;

        //3. Mengakses Element dalam Array
        int elementPertama = numbers[1];
        int elementKedua = numbers[2];

        //4. Mengetahui Ukuran Array
        /*
        Jika ingin mengeluarkan isi atau elemen dalam sebuah array,
        maka kita harus mengetahui ukuran array/collection terlebih dahulu
         */
        int ukuranArray = numbers.length;

        //5. FOR
        for (int i = 0; i < ukuranArray; i++) {
            System.out.println("Cetak array: " + numbers[i]);
        }

        //6. FOR EACH
        for (int number : numbers) {
            System.out.println("Cetak array: " + number);
        }

    }
}
