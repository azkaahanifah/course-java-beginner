package org.project.sesikedua;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[] args) {
        /**
         * SET
         * - tidak memiliki index
         * - bersifat acak (tidak sesuai urutan)
         */

        //1. Inisialisasi
        Set<String> names = new HashSet<>();

        //2. Menambahkan beberapa nama ke dalam HashSet
        names.add("Azka");
        names.add("Daniya");
        names.add("Ary");
        names.add("Yonki");
        names.add("Boma");
        names.add("Ilham");

        //3. Iterasi semua nama
        for (String name : names) {
            System.out.println(name);
        }

        //4. Menghapus element dengan nama (lebih tepatnya mengakses element dengan objek didalam Set)
        names.remove("Azka");

        //5. Untuk mengecek apakah suatu nama ada di dalam HashSet
        boolean isContains = names.contains("Azka");

        //6. Mengetahui ukuran HashSet
        int ukuranSet = names.size();

    }
}
