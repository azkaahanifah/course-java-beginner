package org.project.sesiketiga;

public class MethodOverloading {
    public static void main(String[] args) {
        //Program
    }

    /**
     * METHOD EXISTING
     */
    public static String printBookTitle(int count) {
        return "";
    }

    /**
     * SYARAT PERTAMA :
     * Jumlah parameter sama dengan method existing tetapi TIPE DATA beda
     */
    public static String printBookTitle(float count) {
        return "";
    }

    /**
     * SYARAT KEDUA :
     * Jumlah PARAMETER beda dengan method existing
     */
    public static String printBookTitle(String title, int count) {
        return "";
    }

}
