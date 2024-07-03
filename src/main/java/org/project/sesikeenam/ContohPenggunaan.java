package org.project.sesikeenam;

public class ContohPenggunaan {

    /**
     * INSTANCE FIELD/INSTANCE VARIABLE
     */
    int number = 0;
    Integer count = null; //object atau tipe data bukan primitiv bisa diinitiate dg value null

    /**
     * CLASS FIELD/CLASS VARIABLE
     */
    static String thisVariable = "variable";


    public static void main(String[] args) {
        /**
         * LOCAL VARIABLE
         */
        String name = "Azka"; //KONDISI AWAL
        long longNumber = 2L;

        //kata kunci THIS -> kalau kita ingin panggil method/function dan attribute/field di kelas itu sendiri
        ContohPenggunaan contohPenggunaan = new ContohPenggunaan();

        String iniVariabel1 = thisVariable;

        if (null != name) {
            name = "Hanifah"; //PROSES MENGUBAH NILAI
            System.out.println("Nama: " + name); //PROSES MENGAMBIL NILAI
        }

        //AKSES CLASS MAHASISWA DISINI
        Student student = new Student();

        //MENETAPKAN NILAI AWAL
        student.setName("Azka Hanifah");
        student.setMajor("Sistem Komputer");
        student.setGraduateYear(2014);

        System.out.println("Nama mahasiswa: " + student.getName());
        System.out.println("Jurusan mahasiswa: " + student.getMajor());
        System.out.println("Angkatan mahasiswa: " + student.getGraduateYear());
    }

    public String test() {
        ContohPenggunaan contohPenggunaan = new ContohPenggunaan();
        contohPenggunaan.count = 0;
        contohPenggunaan.number = 1;

        String iniVariabel1 = thisVariable;

        return null;
    }
}
