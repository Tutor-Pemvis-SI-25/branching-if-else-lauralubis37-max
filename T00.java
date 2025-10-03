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
            System.out.println("bilangan pertama genap");
        } else {
            System.out.println("bilangan pertama ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("bilangan kedua genap");
        } else {
            System.out.println("bilangan kedua ganjil");
        }
        if (x == y) {
            System.out.println("kedua bilangan sama besar");
        } else {
            if (x < y) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("bilangan kedua lebih kecil");
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            q = x + y;
            System.out.println(q);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                r = x * y;
                System.out.println(r);
            } else {
                if (x % 2 == 0 && y % 2 != 0) {
                    System.out.println("berbeda jenis");
                } else {
                    if (x % 2 != 0 && y % 2 == 0) {
                        System.out.println("berbeda jenis");
                    }
                }
            }