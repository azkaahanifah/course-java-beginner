package org.project.sesikeenam;

public class ConstructorImplementation {

    public static void main(String[] args) {
        /**
         * Contoh implementasi constructor parameterized
         */
        Student student = new Student("Azka", "Sistem Komputer", 2014);

        System.out.println("Nama mahasiswa: " + student.getName());
        System.out.println("Jurusan mahasiswa: " + student.getMajor());
        System.out.println("Angkatan mahasiswa: " + student.getGraduateYear());
    }
}
