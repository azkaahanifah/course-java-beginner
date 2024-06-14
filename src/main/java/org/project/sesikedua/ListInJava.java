package org.project.sesikedua;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
        /**
         * LIST
         */

        //1. Inisialisasi/membuat objek baru ArrayList
        List<Integer> numbers = new ArrayList<>();

        //2. Menambahkan element ke dalam Array
        numbers.add(5); //Index ke-0
        numbers.add(4); //Index ke-1
        numbers.add(3); //Index ke-2

        //3. Mengakses element dalam array (MANUAL) menggunakan index
        int elementPertama = numbers.get(0); //Mengambil element untuk index ke-0
        int elementKedua = numbers.get(1); //Mengambil element untuk index ke-1
        int elementKetiga = numbers.get(2); //Mengambil element untuk index ke-2

        //4. Mengakses element dalam array menggunakan PERULANGAN
        for (int number : numbers) {
            System.out.println(number);
        }

        //5. Mengubah element dengan index
        //RUMUS: namaArray.set(index, elementBaru);
        numbers.set(1, 10);

        //6. Menghapus element dengan index
        //RUMUS: namaArray.remove(index);
        numbers.remove(0);

        //7. Mengetahui ukuran array
        int ukuranArray = numbers.size();
    }
}
