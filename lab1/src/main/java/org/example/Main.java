package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину масиву n: ");
        int n = input.nextInt();
        int[] mas = massive(n);
        System.out.print("\nВведений масив : {");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.print(" }\n\n");
        System.out.println("Добуток додатних елементів масиву: " + Multipl(mas));
        System.out.println("Розташованих до останнього додатного елемента: " + sumplus(mas));
    }

    public static int[] massive(int n) {

        return new Random().ints(-100, 100).limit(n).toArray();
    }


    public static int Multipl(int[] mas) {
        int res = 1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                res *= mas[i];
            }
        }
        return res;
    }
    public static int sumplus (int[] mas){
    int sum = 0;
for (int i = mas.length - 1; i > 0; i--)
            if (mas[i] > 0)
    {
        for (int j = 0; j < i; j++)
            sum += mas[j];
        break;
    }
return sum;
    }
}
