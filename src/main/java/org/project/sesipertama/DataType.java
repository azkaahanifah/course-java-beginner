package org.project.sesipertama;

public class DataType {
    public static void main (String[] args) {

        /**
         * Tipe Data Primitif
         *
         * 1. Diawali dengan lower case (huruf kecil)
         * 2. Merepresentasikan tipe data Objek
         * 3. Disimpan langsung di dalam memori
         * 4. Ketika sebuah nilai tipe data primitif di-assign ke sebuah variabel,
         *    maka nilai tersebut disimpan di lokasi memori variabel
         */

        //1. NUMERIC
        //1.1 INTEGRAL

        //1.1.1 FLOATING POINT
        /**
         * Floating
         * 1. Menyimpan satu nilai sebesar 32-bit
         * 2. Digunakan untuk menyimpan bilangan desimal
         */
        float iniFloat = 3.14159f;

        /**
         * Double
         * 1. Menyimpan satu nilai sebesar 64-bit
         * 2. Digunakan untuk menyimpan bilangan desimal
         */
        double iniDouble = 3.987d;

        //1.1.2 INTEGER
        /**
         * Byte
         * 1. Menyimpan satu nilai sebesar 8-bit
         * 2. Range angka yang disimpan -128 sampai 127
         * 3. Digunakan untuk menyimpan bilangan bulat
         */
        byte iniByte = 25;

        /**
         * Short
         * 1. Menyimpan satu nilai sebesar 16-bit
         * 2. Range angka yang disimpan -32,768 sampai 32,767
         * 3. Digunakan untuk menyimpan bilangan bulat
         */
        short iniShort = 20;

        /**
         * Int
         * 1. Menyimpan satu nilai sebesar 32-bit
         * 2. Range angka yang disimpan -2,147,483,648 sampai 2,147,483,647
         * 3. Digunakan untuk menyimpan bilangan bulat
         */
        int iniInt = 10000;

        /**
         * Long
         * 1. Menyimpan satu nilai sebesar 64-bit
         * 2. Range angka yang disimpan -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807
         * 3. Digunakan untuk menyimpan bilangan bulat
         */
        long iniLong = 187654L;

        //1.2 CHARACTER
        /**
         * Character
         * 1. Menyimpan satu nilai sebesar 16-bit
         * 2. Berupa Unicode Character
         */
        char iniChar = 'A';

        /**
         * Boolean
         * 1. Hanya menyimpan satu nilai yaitu TRUE atau FALSE
         */
        boolean iniBoolean = true;

        ////////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * Tipe Data Bukan Primitif
         *
         * 1. Diawali dengan upper case (huruf besar)
         * 2. Tidak langsung disimpan di dalam memori, melainkan merujuk ke sebuah Objek yang ada di memori
         * 3. Bisa bernilai NULL. Contoh: String variabel = null;
         */

        /**
         * String
         * 1. Merepresentasikan sebuah character, termasuk alphanumeric dan special character
         */
        String iniString = "Azka Hanifah";

        Float iniFloatUnprimitive = 3.14f;
        Double iniDoubleUnprimitive = 3.14d;
        Byte iniByteUnprimitive = 25;
        Short iniShortUnprimitive = 12;
        Integer iniIntegerUnprimitive = 10000;
        Long iniLongUnprimitive = 108594L;
        Character iniCharUnprimitive = 'A';
        Boolean iniBooleanUnprimitve = true;

    }
}
