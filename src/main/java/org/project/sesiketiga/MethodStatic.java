package org.project.sesiketiga;

public class MethodStatic {
    public static void main(String[] args) {
        /**
         * 1. Menggunakan method tanpa return value
         */
        printHelloWorld();

        /**
         * 2. Menggunakan method yang memiliki return value
         */
        String myName = printMyName();
        System.out.println("My Name: " + myName);

        /**
         * 3. Menggunakan method yang memiliki return value & parameter
         */
        int number = printNumberWithParameter(10, "Azka");
        System.out.println("Output number: " + number);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static String printMyName() {
        String name = "Azka Hanifah";
        return name;
    }

    public static int printNumberWithParameter(int number, String name) {
        if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
