package org.example.seminar2.hw2;
import java.util.Scanner;

public class ex3 {
        public static void main(String []args) {

            Scanner input = new Scanner(System.in);

            int[] array = new int[10];

            for (int i = 0; i < 10; i++) {
                int a = input.nextInt();

                if (a < 0) array[i] = a * -1;
                else array[i] = a;
            }

            for (int i = 0; i < 10; i++) System.out.print(array[i] + " ");
        }


}