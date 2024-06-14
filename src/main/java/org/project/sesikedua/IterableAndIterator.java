package org.project.sesikedua;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableAndIterator {
    public static void main (String[] args) {
        /**
         * ITERABLE
         * => Interface yang "mendefinisikan cara iterasi melalui elemen dalam suatu koleksi".
         *
         * ITERASI
         * => proses mengakses tiap element dalam suatu koleksi secara berurutan
         *
         * Iterable menyediakan metode iterator() yang mengembalikan objek Iterator.
         *
         * ITERATOR
         * => Objek yang memungkinkan untuk iterasi melalui elemen dalam suatu koleksi.
         */

        /**
         * ITERABLE
         *
         * Koleksi seperti List, Map, dan Set adalah contoh implementasi dari interface Iterable.
         *
         * SIMPELNYA:
         * - parent untuk semua collection di Java, kecuali Map
         * - hanya digunakan agar mendukung perulangan for each loop
         * - semua collection pasti implement iterable, otomatis semua collection di Java mendukung perulangan for each
         */

        List<String> buah = Arrays.asList("apple", "banana", "orange");

        for (String kata : buah) {
            System.out.println(kata);
        }

        //ATAU
        Iterable<String> mentee = List.of("Yonki", "Boma");
        for (String name : mentee) {
            System.out.println("Nama mentee: " + name);
        }

        /**
         * For each bisa diiterable karna method iterator
         */

        /**
         * ITERATOR
         *
         * Iterator adalah interface yang memungkinkan Anda untuk iterasi melalui elemen dalam suatu koleksi.
         * Anda dapat memperoleh iterator dari objek Iterable.
         *
         * SIMPELNYA:
         * - Cara untuk mengakses elemen di collection secara sequential
         */

        Iterator<String> iterator = buah.iterator();
        while (iterator.hasNext()) {
            String kata = iterator.next();
            System.out.println(kata);
        }

    }
}
