package org.project.sesipertama;

public class ConditionalStatement {
    public static void main (String[] args) {
        /**
         * CONDITIONAL STATEMENT
         *
         * RUMUS :
         * JIKA [KONDISI 1] TERPENUHI, MAKA JALANKAN [KEPUTUSAN 1]
         * JIKA KONDISI 1 TIDAK TERPENUHI, MAKA JALANKAN KEPUTUSAN SELANJUTNYA
         */

        /**
         * IF..ELSE
         */
        //Kondisi kita sekarang
        int angka = 10000;

        if (angka == 9000) { //KONDISI 1
            System.out.println("Cetak angka 9000"); //KEPUTUSAN 1
        } else {
            System.out.println("Cetak ini"); //KEPUTUSAN 2
        }

        /**
         * IF..ELSE IF
         * IF..ELSE IF..ELSE
         * IF..ELSE IF..ELSE IF..ELSE
         *
         * Kondisi diatas secara garis besar,
         * yang membedakan hanyalah jumlah kondisi dan keputusan yang akan diambil
         */
        if (angka == 800) { //KONDISI 1
            System.out.println("Ini angka 800"); //KEPUTUSAN 1
        } else if (angka == 700) { //KONDISI 2
            System.out.println("Ini angka 700"); //KEPUTUSAN 2
        } else {
            System.out.println("Ini angka 10000"); //KEPUTUSAN 3
        }

        /**
         * Switch Statement
         * Statement ini secara garis besar mirip dengan IF ELSE, yang membedakan hanyalah sintaks
         */
        //Kondisi kita sekarang
        String alphabet = "A";

        switch (alphabet) { //VARIABEL/OBJEK YANG AKAN KITA CEK KONDISINYA DENGAN KONDISI YANG KITA MILIKI
            case "B": //KONDISI 1
                System.out.println("Ini B"); //KEPUTUSAN 1
                break; //KATA KUNCI AGAR PROGRAM YANG ADA DI DALAM BLOCK SWITCH CASE BERHENTI (HANYA BERHENTI KETIKA KONDISI TRUE)
            case "C": //KONDISI 2
                System.out.println("Ini C"); //KEPUTUSAN 2
                break;
            default: //OTOMATIS DIBACA JIKA TIDAK ADA KONDISI YANG TERPENUH
                System.out.println("Ini A"); //KEPUTUSAN 3
                break;
        }

        /**
         * ? :
         *
         * ? => IF (Jika)
         * : => ELSE
         *
         * RUMUS :
         * TIPE_DATA NAMA_VARIABEL = KONDISI ? KEPUTUSAN 1 : KEPUTUSAN 2
         */
        int number = 10;
        String hasil = number == 9 ? "Kertas" : "Dadu";

        System.out.println("Ini hasilnya: " + hasil);
    }
}
