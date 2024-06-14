package org.project.sesiketiga;

public class MethodNonStatic {

    public static void main(String[] args) {
        /**
         * STEP MEMANGGIL METHOD NON STATIC
         */

        /**
         * 1. Panggil dulu classnya, lalu buat object dari class tersebut dengan kata kunci NEW
         */
        MethodNonStatic methodNonStatic = new MethodNonStatic(); //membuat objek baru dari class MethodNonStatic

        /**
         * 2. Lalu panggil function/method yang ada pada class yang sudah dipanggil, sesuai dengan kebutuhan
         */
        String myName = methodNonStatic.printMyName("Azka");

        /**
         * 3. Print output ke console/terminal
         */
        System.out.println("My name: " + myName);

        /**
         * END
         */

        System.out.println("=======================================================================================");

        //Panggil function printNumber(), jika ada kebutuhan ingin mengeluarkan output angka 1 ke console
        methodNonStatic.printNumber();
    }

    public String printMyName(String name) {
        return name;
    }

    public void printNumber() {
        System.out.println(1);
    }
}
