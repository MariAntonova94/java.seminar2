package org.example.seminar2.hw2;


public class ex2 {

    public static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {0, 8, 9};
        System.out.println(isAscending(array));
    }

}