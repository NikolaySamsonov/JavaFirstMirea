package ru.mirea.lab3.lab3_4;

import java.util.ArrayList;
import java.util.Scanner;



public  class lab3_4 {
    public static Scanner sc = new Scanner(System.in);
    public static int check () {
        int i=0;
        while (true) {
            System.out.println("введите длину маасива");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
            else if (sc.hasNextInt()==false) {
                System.out.println("Invalid input. Please try again.");
                sc.next();
                System.out.println();
                continue;
            }
            if (i<1) {
                System.out.println("Invalid input. Please try again.");
                System.out.println();
                continue;
            }
            if (i>0)break;
        }
        return i;
    }
    public static void main (String[] args) {

        int [] mass = new int[check()];
        ArrayList<Integer> chet = new ArrayList<>();
        System.out.println("Ваш массив");
        for (int i :mass){
            mass[i]=(int)(Math.random()*(mass.length+1));
            if ( mass[i]%2==0)chet.add(mass[i]);
            System.out.println(mass[i]);
        }
        System.out.println("Четные числа из массива");
        System.out.println(chet.toString());
    }
}
