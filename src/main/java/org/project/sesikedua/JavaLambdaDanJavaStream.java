package org.project.sesikedua;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLambdaDanJavaStream {
    public static void main (String[] args) {
        List<String> buah = Arrays.asList("apple", "banana", "orange");

        /**
         * JAVA STREAM atau STREAM API (fitur yang baru ada start dari Java 8)
         *
         * Stream API adalah cara modern dan fungsional untuk memproses data di Java.
         * Stream memungkinkan untuk melakukan operasi seperti filtering, mapping, dan reducing pada data.
         */
        List<String> buahKecil = buah.stream()
                .filter(kata -> kata.length() < 6)
                .collect(Collectors.toList());

        System.out.println(buahKecil);

        //ATAU

        List<String> buahKecilLagi = buah.stream()
                .filter(kata -> kata.length() < 6) //FILTER mirip dengan IF, menyatakan suatu kondisi
                .map(String::toUpperCase) //element didalam list, kata-katanya diubah ke bentuk UPPER CASE (huruf besar semua). jadi misalkan banana, berubah jadi BANANA
                .sorted() //untuk mengurutkan element
                .collect(Collectors.toList());

        buahKecilLagi.forEach(System.out::println);

        /**
         * JAVA LAMBDA atau LAMBDA EXPRESSION
         *
         * Lambda expression adalah cara yang lebih ringkas untuk menulis blok kode anonim.
         * Biasanya digunakan bersama dengan Stream API.
         *
         * Lambda Expression diwakilkan oleh simbol "->"
         */
        buah.forEach(kata -> System.out.println(kata.toUpperCase()));
    }
}
