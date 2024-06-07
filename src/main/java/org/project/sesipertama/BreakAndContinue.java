package org.project.sesipertama;

public class BreakAndContinue {
    public static void main (String[] args) {
        /**
         * BREAK
         * 1. Digunakan untuk keluar loop secara total
         * 2. Meangakhiri iterasi saat ini dan langsung lompat ke luar perulangan
         */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; //KELUAR DARI PERULANGAN SAAT i = 5
            }
            System.out.println("Number: " + i);
        }

        /**
         * CONTINUE
         * 1. Digunakan untuk melewatkan iterasi saat ini dan melanjutkan ke iterasi berikutnya dalam perulangan
         * 2. Mengabaikan sisa kode dalam iterasi saat ini dan langsung melanjutkan ke iterasi berikutnya
         */
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //LEWATI ITERASI UNTUK ANGKA GENAP
            }
            System.out.println("Odd Number: " + i);
        }
    }
}
