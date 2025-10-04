// 12S25037 - Laura Lubis

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, q, r;

        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (x == y) {
            System.out.println("Kedua bilangan sama besar");
        } else {
            if (x > y) {
                System.out.println("Bilangan pertama lebih besar");
            } else {
                if (x < y) {
                    System.out.println("Bilangan kedua lebih besar");
                } else {
                    System.out.println("Bilangan kedua lebih kecil");
                }
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            q = x + y;
            System.out.println("Hasil penjumlahan: " + q);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                r = x * y;
                System.out.println("Hasil perkalian: " + r);
            } else {
                if (x % 2 == 0 && y % 2 != 0) {
                    System.out.println("Berbeda jenis");
                } else {
                    if (x % 2 != 0 && y % 2 == 0) {
                        System.out.println("Berbeda jenis");
                    }
                }
            }
        }
    }
}
