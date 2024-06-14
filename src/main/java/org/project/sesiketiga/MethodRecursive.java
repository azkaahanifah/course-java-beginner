package org.project.sesiketiga;

public class MethodRecursive {
    public static void main(String[] args) {
        /**
         * METHOD RECURSIVE
         * Sebuah teknik memanggil dirinya sendiri
         */

        int input = 5;
        int factorial = calculateFactorial(input);
        System.out.println("Faktorial dari " + input + " adalah: " + factorial);
    }

    public static int calculateFactorial(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * calculateFactorial(input - 1);
        }
    }
}
